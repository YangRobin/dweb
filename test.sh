
pid = ps -ef | grep dweb | grep -v grep | awk '{print $2}'

if pid
then 
  echo "hello"
fi