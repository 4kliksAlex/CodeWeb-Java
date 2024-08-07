CREATE TABLE user_info
(
    uno  CHAR(8) PRIMARY KEY, -- 用户编号，8位字符
    key  CHAR(64),            -- 用户密钥，SHA-256 哈希结果（64个字符）
    auth CHAR(1)
);

CREATE TABLE proj_conf
(
    pno   VARCHAR(255) PRIMARY KEY, -- 项目编号
    cpath VARCHAR(255)              -- 配置文件路径
);

CREATE TABLE proj_scene
(
    pno   VARCHAR(255), -- 项目编号
    uno   CHAR(8),      -- 用户编号，8位字符
    scene TEXT,         -- 项目现场信息，长文本
    PRIMARY KEY (pno, uno),
    FOREIGN KEY (uno) REFERENCES user_info (uno),
    FOREIGN KEY (pno) REFERENCES proj_conf (pno)
);