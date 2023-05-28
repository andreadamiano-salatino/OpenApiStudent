INSERT INTO STUDENTS (id, serial_number, name, surname, date_of_birth, cf)
VALUES(1, '123456789', 'Mario', 'Rossi', '1980-01-01', 'RSSMRA80A01H501U');
INSERT INTO STUDENTS (id, serial_number, name, surname, date_of_birth, cf)
VALUES(2, '123456789', 'Paolo', 'Bianchi', '1980-02-02', 'BNCPLA80B02H501D');
INSERT INTO STUDENTS (id, serial_number, name, surname, date_of_birth, cf)
VALUES(3, '123456789', 'Maria', 'Rossi', '1980-03-03', 'MRARSS90C03H501G');

CREATE SEQUENCE STUDENTS_SEQUENCE_ID START WITH (select max(id) + 1 from STUDENTS);