CREATE TABLE FORUM_POLLS_OPTIONS_VOTES (
ID INT NOT NULL,
CONSTRAINT FORUM_POLLS_OPTIONS_VOTES_PK PRIMARY KEY (ID),
ID_POLL_OPTIONS INT NOT NULL,
CONSTRAINT FORUM_POLLS_OPTIONS_FK FOREIGN KEY (ID_POLL_OPTIONS) REFERENCES FORUM_POLLS_OPTIONS (ID),
ID_USER INT NOT NULL,
CONSTRAINT USERS_TABLE_FK FOREIGN KEY (ID_USER) REFERENCES USERS (ID),
DATE_VOTES TIMESTAMP NOT NULL,
IP VARCHAR(20) NOT NULL
);