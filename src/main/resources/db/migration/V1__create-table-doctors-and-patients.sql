CREATE TABLE doctors (
    id BIGINT NOT NULL auto_increment,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    crm VARCHAR(6) NOT NULL,
    specialty VARCHAR(100) NOT NULL,
    state CHAR(2) NOT NULL,
    city VARCHAR(100) NOT NULL,
    zip_code VARCHAR(9) NOT NULL,
    neighborhood VARCHAR(100) NOT NULL,
    street VARCHAR(100) NOT NULL,
    number VARCHAR(20),
    additional_information VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE patients (
    id BIGINT NOT NULL auto_increment,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    state CHAR(2) NOT NULL,
    city VARCHAR(100) NOT NULL,
    zip_code VARCHAR(9) NOT NULL,
    neighborhood VARCHAR(100) NOT NULL,
    street VARCHAR(100) NOT NULL,
    number VARCHAR(20),
    additional_information VARCHAR(100),
    PRIMARY KEY (id)
);