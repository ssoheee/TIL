## 0806 HADOOP (4대 설치)

BOOTPROTO=none

00:50:56:2D:7F:B6 hadoop1 192.168.111.201

00:50:56:36:AF:46 hadoop2 192.168.111.202

00:50:56:3E:04:52 hadoop3 192.168.111.203

00:50:56:37:74:40 hadoop4 192.168.111.204

mac address 다시 설정, 브릿지 설정 nat로 바꾸기



hadoop1234에 ssh 부여하기

scp authorized_keys root@hadoop4:~/.ssh/authorized_keys



1. vi masters

   hadoop2로 수정

   

   vi slaves에는 

   hadoop2

   hadoop3

   hadoop4 로 수정

   

   systemctl disable firewalld

   systemctl stop firewalld

   

[root@hadoop1 etc]# tar cvfz hadoop.tar.gz hadoop-1.2.1/

[root@hadoop1 etc]# scp hadoop.tar.gz root@hadoop4:/etc

ssh root@hadoop4 "cd /etc;tar xvfz hadoop.tar.gz;rm -rf hadoop.tar.gz"



설정은 설정파일 참고하여 수정



7. vi /etc/hadoop-1.2.1/conf/hadoop-env.sh (수정, 추가)

   export JAVA_HOME=/etc/jdk1.8
   export HADOOP_HOME_WARN_SUPPRESS="TRUE"

   

8. vi /etc/bashrc (추가)

   . /etc/hadoop-1.2.1/conf/hadoop-env.sh

   reboot



9. /etc/profile

   /etc/bashrc

   각 서버에 복사해서 보내기

   

11. hadoop namenode -format

    name이라는 디렉토리 생김

12. start-all.sh



hadoop1에는 namenode만 있고 datanode는 없음

나머지에는 datanode만 있고 namenode 없음



http://192.168.111.201:50070

![1565071305975](C:\Users\student\AppData\Roaming\Typora\typora-user-images\1565071305975.png)



masters에 second추가,

slaves에 slave1, slave2 추가

<?xml version="1.0"?>
<?xml-stylesheet type="text/xsl" href="configuration.xsl"?>

<!-- Put site-specific property overrides in this file. -->

<configuration>

 <property>
    <name>dfs.permissions</name>
    <value>false</value>
  </property>
  <property>
    <name>dfs.replication</name>
    <value>2</value>
  </property>
  <property>
    <name>dfs.http.address</name>
    <value>70.12.114.206:50070</value>
  </property>
  <property>
    <name>dfs.secondary.http.address</name>
    <value>70.12.114.205:50090</value>
  </property>
  <property>
    <name>dfs.name.dir</name>
    <value>/etc/hadoop-1.2.1/name</value>
  </property>
  <property>
    <name>dfs.data.dir</name>
    <value>/etc/hadoop-1.2.1/data</value>
  </property>
</configuration>





<?xml version="1.0"?>
<?xml-stylesheet type="text/xsl" href="configuration.xsl"?>

<!-- Put site-specific property overrides in this file. -->

<configuration>
<property>
  <name>fs.default.name</name>
  <value>hdfs://70.12.114.206:9000</value>
</property>
<property>
  <name>hadoop.tmp.dir</name>
  <value>/etc/hadoop-1.2.1/tmp</value>
</property>
</configuration>





<?xml version="1.0"?>
<?xml-stylesheet type="text/xsl" href="configuration.xsl"?>

<!-- Put site-specific property overrides in this file. -->

<configuration>
<property>
  <name>mapred.job.tracker</name>
  <value>70.12.114.206:9001</value>
</property>
</configuration>