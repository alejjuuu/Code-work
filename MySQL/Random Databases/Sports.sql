
CREATE TABLE Patient (
    PatientNum CHAR(4) PRIMARY KEY,
    LastName CHAR(15),
    FirstName CHAR(15),
    Address CHAR(20),
    City CHAR(15),
    State CHAR(2),
    ZipCode CHAR(5),
    Balance DECIMAL(6, 2 )
);

CREATE TABLE Session (
    SessionNum CHAR(3) PRIMARY KEY,
    SessionDate DATE,
    PatientNum CHAR(4),
    LengthOfSession INT(3),
    TherapistID CHAR(5),
    TherapyCode INT(5)
);

CREATE TABLE Therapies (
    TherapyCode INT(5) PRIMARY KEY,
    Description CHAR(255),
    UnitOfTime INT(3)
);

CREATE TABLE Therapist (
    TherapistID CHAR(5) PRIMARY KEY,
  LastName CHAR(15),
    FirstName CHAR(15),
    Street CHAR(20),
    City CHAR(15),
    State CHAR(2),
    ZipCode CHAR(5)
);

INSERT INTO Patient
VALUES
('1010','Koehler','Robbie','119 West Bay Dr.','San Vista','TX','72510',1535.15)
;
INSERT INTO Patient
VALUES
('1011','King','Joseph','941 Treemont','Oak Hills','TX','74081',212.80)
;
INSERT INTO Patient
VALUES
('1012','Houghland','Susan','7841 Lake Side Dr.','Munster','TX','72380',1955.40)
;
INSERT INTO Patient
VALUES
('1013','Falls','Tierra','44 Applewood Ave.','Palm Rivers','TX','72511',1000.35)
;
INSERT INTO Patient
VALUES
('1014','Odepaul','Ben','546 WCR 150 South','Munster','TX','74093',525.00)
;
INSERT INTO Patient
VALUES
('1015','Venable','Isaiah','37 High School Road','Waterville','TX','74183',432.30)
;
INSERT INTO Patient
VALUES
('1016','Waggoner','Brianna','2691 Westgrove St.','Delbert','TX','72381',714.25)
;
INSERT INTO Patient
VALUES
('1017','Short','Tobey','1928 10th Ave.','Munster','TX','72512',967.60)
;
INSERT INTO Patient
VALUES
('1018','Baptist','Joseph','300 Erin Dr.','Waterville','TX','76658',1846.75)
;
INSERT INTO Patient
VALUES
('1019','Culling','Latisha','4238 East 71st St.','San Vista','TX','74071',1988.50)
;
INSERT INTO Patient
VALUES
('1020','Marino','Andre','919 Horton Ave.','Georgetown','TX','72379',688.95)
;

INSERT INTO Patient
VALUES
('1021','Wilson','Tammy','424 October Blvd.','Waterville','TX','76658',2015.30)
;

INSERT INTO Session
VALUES
(27,'2018-10-10','1011',45,'JR085',92507)
;
INSERT INTO Session
VALUES
(28,'2018-10-11','1016',30,'AS648',97010)
;
INSERT INTO Session
VALUES
(29,'2018-10-11','1014',60,'SW124',97014)
;
INSERT INTO Session
VALUES
(30,'2018-10-12','1013',30,'BM273',97033)
;
INSERT INTO Session
VALUES
(31,'2018-10-15','1016',90,'AS648',98960)
;
INSERT INTO Session
VALUES
(32,'2018-10-16','1018',15,'JR085',97035)
;
INSERT INTO Session
VALUES
(33,'2018-10-17','1017',60,'SN852',97039)
;
INSERT INTO Session
VALUES
(34,'2018-10-17','1015',45,'BM273',97112)
;
INSERT INTO Session
VALUES
(35,'2018-10-18','1010',30,'SW124',97113)
;
INSERT INTO Session
VALUES
(36,'2018-10-18','1019',75,'SN852',97116)
;
INSERT INTO Session
VALUES
(37,'2018-10-19','1020',30,'BM273',97124)
;
INSERT INTO Session
VALUES
(38,'2018-10-19','1021',60,'AS648',97535)
;

INSERT INTO Therapies
VALUES
(90901,'Biofeedback training by any modality',NULL)
;
INSERT INTO Therapies
VALUES
(92240,'Shoulder strapping',NULL)
;
INSERT INTO Therapies
VALUES
(92507,'Treatment of speech',15)
;
INSERT INTO Therapies
VALUES
(92530,'Knee strapping',NULL)
;
INSERT INTO Therapies
VALUES
(92540,'Ankle and/or foot strapping',NULL)
;
INSERT INTO Therapies
VALUES
(95831,'Extremity or trunk muscle testing',NULL)
;
INSERT INTO Therapies
VALUES
(97010,'Hot or cold pack application',NULL)
;
INSERT INTO Therapies
VALUES
(97012,'Mechanical traction',NULL)
;
INSERT INTO Therapies
VALUES
(97014,'Electrical stimulation',NULL)
;
INSERT INTO Therapies
VALUES
(97016,'Vasopneumatic devices',NULL)
;
INSERT INTO Therapies
VALUES
(97018,'Paraffin bath',NULL)
;
INSERT INTO Therapies
VALUES
(97022,'Whirlpool',NULL)
;
INSERT INTO Therapies
VALUES
(97026,'Infrared',NULL)
;
INSERT INTO Therapies
VALUES
(97032,'Electrical stimulation',15)
;
INSERT INTO Therapies
VALUES
(97033,'Iontophoresis ',15)
;
INSERT INTO Therapies
VALUES
(97035,'Ultrasound',15)
;
INSERT INTO Therapies
VALUES
(97039,'Unlisted modality',15)
;
INSERT INTO Therapies
VALUES
(97110,'Therapeutic exercises to develop strength and endurance, range of motion, and flexibility',15)
;
INSERT INTO Therapies
VALUES
(97112,'Neuromuscular re-education of movement, balance, coordination, etc.',15)
;
INSERT INTO Therapies
VALUES
(97113,'Aquatic therapy with therapeutic exercises',15)
;
INSERT INTO Therapies
VALUES
(97116,'Gait training',15)
;
INSERT INTO Therapies
VALUES
(97124,'Massage',15)
;
INSERT INTO Therapies
VALUES
(97139,'Unlisted therapeutic procedure',NULL)
;
INSERT INTO Therapies
VALUES
(97140,'Manual therapy techniques',15)
;
INSERT INTO Therapies
VALUES
(97150,'Group therapeutic procedure',15)
;
INSERT INTO Therapies
VALUES
(97530,'Dynamic activities to improve functional performance, direct (one-on-one) with the patient',15)
;
INSERT INTO Therapies
VALUES
(97535,'Self-care/home management training',15)
;
INSERT INTO Therapies
VALUES
(97750,'Physical performance test or measurement',15)
;
INSERT INTO Therapies
VALUES
(97799,'Unlisted physical medicine/rehabilitation service or procedure',NULL)
;
INSERT INTO Therapies
VALUES
(98941,'CMT of the spine',NULL)
;
INSERT INTO Therapies
VALUES
(98960,'Education and training for patient self-management',30)
;

INSERT INTO Therapist
VALUES
('AS648','Shields','Anthony','5222 Eagle Court','Palm Rivers','TX','72511')
;
INSERT INTO Therapist
VALUES
 ('BM273','McClain','Bridgette','385 West Mill St.','Waterville','TX','76658')
;
INSERT INTO Therapist
VALUES
('JR085','Risk','Jonathan','1010 650 North','Palm Rivers','TX','72511')
;
INSERT INTO Therapist
VALUES
('SN852','Nair','Saritha','25 North Elm St.','Livewood','TX','72512')
;
INSERT INTO Therapist
VALUES
('SW124','Wilder','Steven','7354 Rockville Road','San Vista','TX','72510')
;


