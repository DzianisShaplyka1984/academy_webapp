CREATE database temp;

USE temp;

CREATE TABLE hibernate_sequence (
    next_val bigint DEFAULT NULL
);


CREATE TABLE author
(
    id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(256) NOT NULL
);

CREATE TABLE book
(
    id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
    title varchar(256) NOT NULL,
    year int,
    author_id bigint,
    CONSTRAINT FK_AUTHOR FOREIGN KEY (author_id)
        REFERENCES author(id)
)
