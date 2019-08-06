1. mariadb 다운 (책 참고)

   

2. hadoop 다운 (https://archive.apache.org/dist/hadoop/common/hadoop-1.2.1/[hadoop-1.2.1.tar.gz](http://apache.mirror.cdnetworks.com/hadoop/core/hadoop-1.2.1/hadoop-1.2.1.tar.gz))

   cp -r hadoop-1.2.1 /etc/

   

3. vi /etc/profile

   TOMCAT_HOME=/etc/tomcat
   JAVA_HOME=/etc/jdk1.8
   HADOOP_HOME=/etc/hadoop-1.2.1
   CLASSPATH=/etc/jdk1.8/lib
   export CLASSPATH JAVA_HOME TOMCAT_HOME HADOOP_HOME
   PATH=.:$JAVA_HOME/bin:$TOMCAT_HOME/bin:$HADOOP_HOME/bin:$PATH

   

4. ssh 

   자기 자신 서버에 들어갈 때도 밖으로 나갔다가 다시 들어오게끔 하는 방법

   -> 서버와 서버끼리 자유롭게 왕래하는 데에 있어서 걸림돌이 되므로 환경설정을 바꿔줘야함

   ssh-keygen -t dsa -P '' -f ~/.ssh/id_dsa

   cd .ssh/ (home에서)

   cat id_dsa.pub >> authorized_keys 배포키를 만들어줌



5. systemctl disable firewalld



6. vi /etc/hadoop-1.2.1/conf/core-site.xml (추가)

   <configuration>
   <property>
     <name>fs.default.name</name>
     <value>hdfs://localhost:9000</value>
   </property>
   <property>
     <name>dfs.tmp.dir</name>
     <value>/etc/hadoop-1.2.1/tmp</value>
   </property>
   </configuration>



7. vi /etc/hadoop-1.2.1/conf/hdfs-site.xml (추가)

   <configuration>
   <property>
     <name>dfs.replication</name>
     <value>1</value>
   </property>
   <property>
     <name>dfs.name.dir</name>
     <value>/etc/hadoop-1.2.1/name</value>
   </property>
   <property>
     <name>dfs.data.dir</name>
     <value>/etc/hadoop-1.2.1/data</value>
   </property>
   <property>
     <name>dfs.webhdfs.enabled</name>
     <value>true</value>
   </property>
   </configuration>

   

8.  vi /etc/hadoop-1.2.1/conf/mapred-site.xml

   <configuration>

   <property>

     <name>mapred.job.tracker</name>

     <value>localhost:9001</value>

   </property>

   </configuration>

   

9.  vi /etc/hadoop-1.2.1/conf/hadoop-env.sh (수정, 추가)

   export JAVA_HOME=/etc/jdk1.8
   export HADOOP_HOME_WARN_SUPPRESS="TRUE"

   

10. vi /etc/bashrc (추가)

    . /etc/hadoop-1.2.1/conf/hadoop-env.sh

    reboot



11. hadoop namenode -format

    name이라는 디렉토리 생김



12. start-all.sh

    ![](C:\Users\student\Desktop\소희\hadoop.PNG)

    data라는 디렉토리 생김

    . ./hadoop-env.sh

    끝낼 때에는 stop-all.sh 꼭 해야함



13. http://70.12.114.204:50070/ 하둡서버

    hadoop dfs -mkdir /data/input1 하면 하둡서버에 /data/input1라는 폴더 생김

    hadoop dfs -put README.txt /data/input1 하둡서버에 README.txt 보냄

    hadoop jar hadoop-examples-1.2.1.jar wordcount /data/input1 /data/output1 앞에 있는 문서를 분석하여 뒤에 있는 폴더에 저장