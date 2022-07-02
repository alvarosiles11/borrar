 docker image build -t alvarosiles/vuelo:1.0 . 
 docker container run -p 8080:8080 --name vueloContainer vuelo:1.0