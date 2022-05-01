echo "\nПеред запуском скрипта вам необходимо:
Запустить десктопное приложение docker;
Установить jenkins;
Создать ssh ключ с названием \"jenkins_agent_key\";
Открыть 22 порт, если он закрыт.
...\n"
#Запуск jenkins
brew services start jenkins-lts
#Создание docker container для jenkins
docker run -d --rm --name=agent1 -p 22:22 \
-e "JENKINS_AGENT_SSH_PUBKEY=`cat ~/.ssh/jenkins_agent_key.pub`" \
jenkins/ssh-agent:alpine
#Закидываем переменные в docker container
VARS1="HOME=|USER=|MAIL=|LC_ALL=|LS_COLORS=|LANG=" ;\
VARS2="HOSTNAME=|PWD=|TERM=|SHLVL=|LANGUAGE=|_=" ;\
VARS="${VARS1}|${VARS2}" ;\
docker exec agent1 sh -c "env | egrep -v '^(${VARS})' >> /etc/environment"
#Устаналиваем git на agent
docker exec -w /home/jenkins/ agent1 apk "add" "git"

#Полезные команды:
#docker system prune