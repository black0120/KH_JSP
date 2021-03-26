CREATE TABLE member_t (
    userid varchar2(20) primary key,
    password varchar2(25),
    email varchar2(100),
    joindate date default sysdate
);
commit;
SELECT * FROM member_t;
INSERT INTO member_t (userid, password, email) VALUES ('admin', 'admin', 'admin@admin.com');
INSERT INTO member_t (userid, password, email) VALUES ('user1', 'user1', 'user1@domain.com');
commit;

CREATE TABLE visit_t (
    id number primary key,
    author varchar2(20) not null,
    context varchar2(2000) not null,
    create_date date default sysdate
);