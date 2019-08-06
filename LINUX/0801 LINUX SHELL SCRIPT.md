## 0801 LINUX SHELL SCRIPT

#!/bin/sh

코드

exit 0



chmod +x temp.sh // 코드를 입력해서 속성을 실행 가능으로 변경해야 한다!



#!/bin/sh
ctn=0
for i in $(ls *.sh)
do
  if [ $i = "ex.sh" ]
  then
      echo "OK: $I"
  fi
  ctn=`expr $ctn + 1`
done
  echo "COUNT: $ctn "
exit 0

// for문과 if문을 같이 쓸 수 있다



#!/bin/sh
startTomcat(){
  echo "start Tomcat Function"
  return
}
stopTomcat(){
  echo "stop Tomcat Function"
  return
}

echo "Tomcat Management Tool"
while [ 1 ]
do
  echo "Input Command (start,stop,check,q): "
  read cmd

  case $cmd in
     start)
       startTomcat
       echo "Tomcat Started";;
     stop)
       stopTomcat
       echo "Tomcat Stopped";;
     q)
       echo "Exit"
       break;;
  esac
done
echo "EXIT Shell Program"
exit 0





* export

  외부 변수, 선언한 변수를 다른 프로그램에서도 사용가능



yum -y install wget*



ln 무엇을 어디로



#!/bin/sh
while [ 1 ]
do
echo "Input what you wanna install (jdk , tomcat, eclipse) or quit (q) "
read cmd
case $cmd in
        jdk)
                wget http://70.12.114.58/test/jdk1.8.tar.gz
                tar xvfz jdk1.8.tar.gz
                if [ -e /etc/jdk1.8 ]
                then
                        echo "Already exits. wanna delete? (Y/N)"
                        read cmdd
                        if [ "$cmdd" = "Y" ]
                        then
                                rm -rf /etc/jdk1.8
                        fi
                fi
                mv jdk1.8.0_221 /etc/jdk1.8
                if [ -e /usr/bin/java ]
                then
                        rm /usr/bin/java
                fi
                ln -s /etc/jdk1.8/bin/java /usr/bin/java
                echo "JDK install Complete";;
        tomcat)
                wget http://70.12.114.57/test/tomcat.tar.gz
                tar xvf tomcat.tar.gz
                fname=/etc/tomcat
                if [ -e $fname ]
                then
                        echo "Already exits. wanna delete? (Y/N)"
                        read cmdd
                        if [ $cmdd = 'Y' ]
                                then
                                        rm -rf $fname
                        fi
                fi
                mv apache-tomcat-9.0.22 tomcat
                mv tomcat /etc/
                if [ -e /usr/bin/startcat ]
                then
                  rm /usr/bin/startcat
                fi

​				if [ -e /usr/bin/stopcat ]
​                then
​                  rm /usr/bin/stopcat
​                fi
​                ln -s /etc/tomcat/bin/startup.sh /usr/bin/startcat
​                ln -s /etc/tomcat/bin/shutdown.sh /usr/bin/stopcat
​                echo "Tomcat install Complete";;
​        eclipse)
​                 if [ -d /etc/eclipse ]
​                        then
​                        echo "eclipse is already installed. do you want remove and reinstall it?[Y,N]"
​                        read reinstall
​                        until [ "$reinstall" = "Y" ] || [ "$reinstall" = "N" ]
​                             do
​                                echo "please input Y or N"
​                                read reinstall
​                             done
​                        if [ $reinstall = "N" ]
​                        then
​                                echo "install system stop.."
​                                return
​                        else
​                        rm -rf /etc/eclipse/
​                        fi
​                else
​                        echo "install system is start"
​                fi
​                echo "eclipse install start"
​                wget http://70.12.114.51/test/eclipse.tar.gz
​                tar xvfz eclipse.tar.gz
​                mv eclipse /etc/eclipse
​                if [ -e /usr/bin/eclipse ]
​                then
​                        rm /usr/bin/eclipse
​                fi
​                ln -s /etc/eclipse/eclipse /usr/bin/eclipse
​                echo "Tomcat install Complete";;
​        q)
​                break;;
​        *)
​                ;;
esac

done

exit 0





* grep



#### 환경구축

cmd 

rundll32 "C:\Program Files (x86)\VMware\VMware Player\vmnetui.dll" VMNetUI_ShowStandalone



subnet IP 에 값 세팅

호스트 OS : ~~.~~.~.1

게이트웨이, DNS서버 : ~~.~~.~.2

DHCP 서버역할 : ~~.~~.~.254



###### 업데이트 끄기, 알람 끄기,

cd /etc/yum. repos. d/

gedit CentOS-Base. repo

gedit CentOS-Sources. repo 에서 release update를 지워준다.

mv CentOS-Base.repo CentOS-Base.repo.bak

wget http://download.hanbit.co.kr/centos/7/CentOS-Base.repo

rm *.repo~

yum clean all



###### ip 주소 설정

cd /etc/sysconfig/network-scripts/ifcfg-ens33

gedit ifcfg-ens33

수정

BOOTPROTO="none"

추가

IPADDR=192.168.111.101

- 이컴퓨터의 ip 어드레스 세팅

NETMASK=255.255.255.0

- 0번 부터 255번 까지 할당

GATEWAY=192.168.111.2

DNS1=192.168.111.2

- GATEWAY 와 DNS 의 ip 주소



systemctl restart network



###### hostname 과 ip를 매칭

gedit /etc/hosts

추가 192.168.111.111 server1



###### 보안 기능을 끄자

gedit /etc/sysconfig/selinux

수정

SELINUX = disabled



PROGRAM INSTALL



/etc/profile

1)

2)



firewall config

systemctl restart network

-add in script











### VM SETTING

1. NETWORK SETTING - 70.12.114.19X

2. /etc/yum.repos.d

3. /etc/sysconfig/selinux

4. Program Install

5. Profile Setting

   ```
   JAVA_HOME=/opt/jdk1.8;
   export JAVA_HOME
   CLASSPATH=$JAVA_HOME/lib;
   export CLASSPATH JAVA_HOME
   PATH=.:$JAVA_HOME/bin:$PATH;
   export PATH
   ```

6. Firewall Config

   firewall-cmd --permanent --add-service=http

   firewall-cmd --permanent --add-service=https

   firewall-cmd --permanent --add-port=1521/tcp

   firewall-cmd --reload

   firewall-cmd --list

   systemctl restart network



cmd 

rundll32 "C:\Program Files (x86)\VMware\VMware Player\vmnetui.dll" VMNetUI_ShowStandalone



vi /etc/sysconfig/network-scripts/ifcfg-ens33

IPADDR=70.12.114.204

NETMASK=255.255.255.0

GATEWAY=70.12.114.1

DNS1=168.126.63.1



systemctl restart network



TOMCAT_HOME=/etc/tomcat
export TOMCAT_HOME
JAVA_HOME=/etc/jdk1.8
export JAVA_HOME
CLASSPATH=/etc/jdk1.8/lib
export CLASSPATH JAVA_HOME
PATH=.:$JAVA_HOME/bin:$TOMCAT_HOME/bin:$PATH
export PATH

tomcat > bin > conf > server.xml > 69번 째 줄 port 80으로 바꾸기

hostnamectl set-hostname HADOOPSERVER1

70.12.114.204

00:50:56:2E:41:24



ip setting

mac address setting

hostname

/etc/hosts





/etc/hosts

ip주소 server1 추가









dbserver1에서 server1으로 파일 카피해서 보내기

scp -rp /etc/hosts root@server1; /etc