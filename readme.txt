программа для работы с базой данных
create table person(
	id seryal prymery key,
	email varchar,
	pasword varchar
);

CREATE TABLE personData (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            phone VARCHAR(20) ,
                            gender varchar(1) ,
                            cyti varchar ,
                            CONSTRAINT fk_person_id FOREIGN KEY (id) REFERENCES person (id)
);

CREATE TABLE items (
    idItems SERIAL PRIMARY KEY,
    is_new BOOLEAN,
    gender CHAR (1) CHECK (gender IN ('m', 'f')),
    type VARCHAR(255),
    nameItems VARCHAR(255),
    href VARCHAR(255) DEFAULT NULL
);
CREATE TABLE move (
                                id_move SERIAL PRIMARY KEY,
                                idItems INT REFERENCES items(idItems),
                                idPerson INT REFERENCES person(id)
);

необходимо в классе DB провести замену значений на свои значения . класс CRUD служет для работы с талицой person .
класс CRUDU для работы с persondata . CRUDmove для работы с move . в программе есть необходимые скрипиы для создания
пользователя , а также регистрации кто и что заказал .