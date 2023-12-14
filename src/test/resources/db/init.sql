create schema scratch;

create table scratch.hello
(
    id    bigserial   not null primary key,
    name  varchar(50) not null,
    lower integer     not null default 0,
    upper integer     not null default 10
);

insert into scratch.hello (name, lower, upper)
values ('thing', 35, 42),
       ('other', 19, 28),
       ('a', 4, 78),
       ('b', 2, 65),
       ('c', 42, 353),
       ('d', 12, 22),
       ('e', 10, 43567);

