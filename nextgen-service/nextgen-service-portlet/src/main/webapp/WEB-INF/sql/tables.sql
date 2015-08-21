create table base_binghai (
	hkey VARCHAR(75) null,
	muTitle VARCHAR(75) null,
	buwei VARCHAR(75) null,
	tab VARCHAR(75) null,
	cName VARCHAR(75) null,
	cId INTEGER,
	c1Name VARCHAR(75) null,
	c1Id INTEGER,
	c2Name VARCHAR(75) null,
	c2Id INTEGER,
	binghaiLeixing VARCHAR(75) null,
	stageName VARCHAR(75) null,
	stageId INTEGER,
	koufen INTEGER,
	visitContent VARCHAR(75) null,
	visitedBy VARCHAR(75) null,
	visitedOn VARCHAR(75) null,
	revisitedBy VARCHAR(75) null,
	revisitedOn VARCHAR(75) null,
	binghaiShuzhi INTEGER,
	gongzuoliangAction VARCHAR(75) null,
	gongzuoliangName VARCHAR(75) null,
	gongzuoliangUnit VARCHAR(75) null,
	gongzuoliangTval VARCHAR(75) null,
	binghaiId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	proofCount LONG,
	referenceRadio VARCHAR(75) null,
	daochaJson VARCHAR(75) null
);

create table base_binghai_proof (
	mime VARCHAR(75) null,
	url VARCHAR(75) null,
	binghaiId VARCHAR(75) null,
	binghaiProofId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table base_mu (
	hkey VARCHAR(75) not null,
	par VARCHAR(75) null,
	title VARCHAR(75) null,
	muId LONG not null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	primary key (hkey, muId)
);

create table base_mu_ext (
	hkey VARCHAR(75) null,
	value VARCHAR(75) null,
	muExtId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	key_ VARCHAR(75) null
);

create table base_mu_interrel (
	hkey VARCHAR(75) null,
	par VARCHAR(75) null,
	type_ VARCHAR(75) null,
	muInterrelId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table base_mu_quxian_qujian (
	hkey VARCHAR(75) null,
	muQuxianQujianId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table base_mu_wufeng_xianlu (
	hkey VARCHAR(75) null,
	muWufengXianluId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table base_mu_zhengxian_podao (
	hkey VARCHAR(75) null,
	muZhengxianPodaoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table lov_binghai_leixing (
	code VARCHAR(75) not null primary key,
	title VARCHAR(75) null
);

create table lov_binghai_pingfen (
	binghaiPingfenId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dalei VARCHAR(75) null,
	vmin DOUBLE,
	vmax DOUBLE,
	xiangmu VARCHAR(75) null,
	dengji VARCHAR(75) null,
	dengji_min DOUBLE,
	dengji_max DOUBLE
);

create table lov_mu_type (
	code_ VARCHAR(75) not null primary key,
	title VARCHAR(75) null
);