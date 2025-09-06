FROM tomcat:10.1-jdk17-temurin
COPY ch06_ex1_email.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
