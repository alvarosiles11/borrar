### DMS-NUR VUELOS

### Alvaro Siles Estrada

### Testing

CQRS created in java!

### Contenerización de Aplicaciones

<!-- docker compose up
docker compose down
docker image tag mongo alvarosiles/mongo
docker compose up

docker image push alvarosiles/vuelo-java
docker image push alvarosiles/mongo -->

//en CMD vsc
npm init --yes
npx husky-init && npm install
npm install --save-dev lint-staged

//archivo precommit
<!-- npx lint-staged --relative -->
//package.json
<!-- "lint-staged": {
  "*.{html,css,scss,js,ts,tsx,json,md,yaml,java}": [
    "prettier --write",
		"eslint --fix"
   ]
} -->
npm install -g eslint
npx eslint --init

npm install eslint --save-dev
Add in package.json this script : "eslint": "eslint --ignore-path .gitignore ."

https://nx.dev/packages/linter/executors/eslint
 https://www.npmjs.com/package/lint-staged

 https://lenguajejs.com/javascript/caracteristicas/eslint/

   "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "prepare": "husky install",
    "alvaro": "npx prettier --write . && eslint **/* --ext .js,.ts,.tsx",
    "romeo": "eslint src --ext .js,.ts,.tsx"
  },