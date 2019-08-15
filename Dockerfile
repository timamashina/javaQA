docker run -d -i \
-e POSTGRES_PASSWORD='pass1234' \
-e POSTGRES_USER='postgres' \
-p 5433:5432 \
--name postgres-local postgres