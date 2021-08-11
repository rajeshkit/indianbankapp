FROM openjdk:11
COPY ./target/indianbankapp.war indianbankapp.war
CMD ["java","-jar","indianbankapp.war"]