CREATE TABLE FORUM_POLLS_OPTIONS (
ID INT,
CONSTRAINT FORUM_POLLS_OPTIONS_PK PRIMARY KEY (ID),
ID_POST INT NOT NULL,
CONSTRAINT FORUM_POSTS_FK FOREIGN KEY (ID_POST) REFERENCES FORUM_POSTS (ID),
TITLE VARCHAR(64) NOT NULL,
DATE_POLLS TIMESTAMP NOT NULL
);