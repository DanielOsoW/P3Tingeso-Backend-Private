FROM openjdk:15.0.1-oracle

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew build

COPY . .

COPY docker-entrypoint.sh /

RUN chmod +x docker-entrypoint.sh

ENTRYPOINT ["bash","docker-entrypoint.sh"]

EXPOSE 3000
