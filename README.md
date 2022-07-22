### DMS-NUR VUELOS

### Alvaro Siles Estrada

### Testing

CQRS created in java!

### Contenerización de Aplicaciones

docker compose up
docker compose down
docker image tag mongo alvarosiles/mongo
docker compose up


docker image push alvarosiles/vuelo-java
docker image push alvarosiles/mongo


//en consola vsc
npm init --yes
npx husky-init && npm install

//archivo precommit
npx lint-staged --relative

//en consola cmd
npm install --save-dev lint-staged
https://www.npmjs.com/package/lint-staged

//package.json

  "lint-staged": {
    "*.{java}": [
      "prettier --write",
      "git add"
    ]
  }