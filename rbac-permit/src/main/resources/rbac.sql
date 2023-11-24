/**
  权限表
 */

create table menu
(
    id          bigint                              not null
        primary key,
    menu_name   varchar(255)                        null,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    update_time timestamp default CURRENT_TIMESTAMP not null,
    is_delete   int       default 1                 not null,
    parent_id   bigint    default -1                not null comment '父权限id'
)
    comment '权限表';

/**
  角色表
 */

create table role
(
    id          bigint                    not null
        primary key,
    role_name   varchar(255)              not null,
    create_time timestamp default (now()) not null,
    update_time timestamp default (now()) not null,
    is_delete   int       default 1       not null
)
    comment '角色';

/**
  角色与权限关系表
 */

create table role_menu
(
    id          bigint                              not null
        primary key,
    role_id     bigint                              not null,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    update_time timestamp default CURRENT_TIMESTAMP null,
    is_delete   int       default 1                 null,
    menu_id     bigint                              not null,
    constraint menu_id
        foreign key (menu_id) references menu (id),
    constraint role_id_1
        foreign key (role_id) references role (id)
);

/**
  用户与权限关系表
 */
create table role_user
(
    id          bigint                              not null
        primary key,
    role_id     bigint                              null,
    user_id     bigint                              null,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    update_time timestamp default CURRENT_TIMESTAMP not null,
    is_delete   int       default 1                 not null,
    constraint role_id
        foreign key (role_id) references role (id),
    constraint user_id
        foreign key (user_id) references user (id)
)
    comment '角色_用户';

/**
  用户表
 */
create table user
(
    id          bigint                    not null
        primary key,
    username    varchar(255)              not null,
    password    varchar(255)              not null,
    create_time timestamp default (now()) not null,
    update_time timestamp default (now()) not null,
    is_delete   int       default 1       not null
);

