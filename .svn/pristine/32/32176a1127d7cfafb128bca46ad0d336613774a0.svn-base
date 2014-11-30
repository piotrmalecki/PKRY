-- Create sequences section -------------------------------------------------

CREATE SEQUENCE ID_motocyklu_seq
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/                                     
CREATE SEQUENCE ID_miasta_seq
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/
CREATE SEQUENCE ID_personelu_seq
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/
CREATE SEQUENCE ID_klienta_seq
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/
CREATE SEQUENCE ID_oddzialu_seq
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/
CREATE SEQUENCE ID_zamowienia_trig
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
 CACHE 20
/
CREATE SEQUENCE ID_silnika_trig
 INCREMENT BY 1
 START WITH 1
 NOMAXVALUE
 NOMINVALUE
CACHE 20
/

-- Create tables section -------------------------------------------------

-- Table Egzemplarze
CREATE TABLE Egzemplarze(
  idMotocyklu Number NOT NULL,
  marka Varchar2(20 ) NOT NULL,
  model Varchar2(20 ) NOT NULL,
  typ Varchar2(20 ) NOT NULL,
  kolor Varchar2(20 ) NOT NULL,
  idSilnika Number NOT NULL,
  rokProdukcji Number(4,0) NOT NULL,
  waga Number(4,0) NOT NULL
        CONSTRAINT waga_check CHECK (waga > 0),
  szerokosc Number(3,0) NOT NULL
        CONSTRAINT CheckConstraint1 CHECK (szerokosc > 0),
  wysokosc Number(3,0) NOT NULL
        CONSTRAINT CheckConstraint2 CHECK (wysokosc > 0),
  dlugosc Number(3,0) NOT NULL
        CONSTRAINT CheckConstraint3 CHECK (dlugosc > 0),
  cenaDetaliczna Number(8,2) NOT NULL,
  gwarancja Number(2,0) NOT NULL
        CONSTRAINT CheckConstraint6 CHECK (gwarancja > 0),
  opis Varchar2(255 ),
  CONSTRAINT rokProdukcji_check CHECK (rokProdukcji BETWEEN 1900 and 2300)
)
/
-- Create indexes for table Egzemplarze
CREATE INDEX Index1 ON Egzemplarze (idMotocyklu)
/
-- Add keys for table Egzemplarze
ALTER TABLE Egzemplarze ADD CONSTRAINT Key1 PRIMARY KEY (idMotocyklu)
/

-- Table Motocykle
CREATE TABLE Motocykle(
  model Varchar2(20 ) NOT NULL,
  marka Varchar2(20 ) NOT NULL
)
/
-- Add keys for table Motocykle
ALTER TABLE Motocykle ADD CONSTRAINT Key2 PRIMARY KEY (marka,model)
/

-- Table Producenci
CREATE TABLE Producenci(
  marka Varchar2(20 ) NOT NULL,
  kraj Varchar2(20 ) NOT NULL
)
/
-- Add keys for table Producenci
ALTER TABLE Producenci ADD CONSTRAINT Key3 PRIMARY KEY (marka)
/

-- Table Sprzedane
CREATE TABLE Sprzedane(
  idZamowienia Number NOT NULL,
  dataOdbioru Date DEFAULT SYSDATE NOT NULL
)
/
-- Add keys for table Sprzedane
ALTER TABLE Sprzedane ADD CONSTRAINT Key4 PRIMARY KEY (idZamowienia)
/

-- Table JazdyProbne
CREATE TABLE JazdyProbne(
  idKlienta Number NOT NULL,
  nrSeryjny Varchar2(20 ) NOT NULL,
  idPracownika Number NOT NULL,
  idOddzialu Number NOT NULL,
 od Timestamp(0) NOT NULL,
 do Timestamp(0) NOT NULL,
  uwagi Varchar2(255 )
)
/
-- Create indexes for table JazdyProbne
CREATE INDEX Index3 ON JazdyProbne (idKlienta,nrSeryjny,idPracownika)
/
-- Add keys for table JazdyProbne
ALTER TABLE JazdyProbne ADD CONSTRAINT Key6 PRIMARY KEY (idKlienta,nrSeryjny)
/

-- Table Klienci
CREATE TABLE Klienci(
  idKlienta Number NOT NULL,
  imie Varchar2(20 ) NOT NULL,
  drugieImie Varchar2(20 ),
  nazwisko Varchar2(20 ) NOT NULL,
  dataUrodzenia Date NOT NULL,
  kodPocztowy Char(5 ) NOT NULL
        CONSTRAINT CheckConstraint9 CHECK (kodPocztowy > 0),
  miasto Varchar2(30 ) NOT NULL,
  ulica Varchar2(30 ) NOT NULL,
  nrDomu Varchar2(3 ) NOT NULL,
  nrMieszkania Number(3,0)
        CONSTRAINT CheckConstraint10 CHECK (nrMieszkania > 0),
  pesel Char(11 )
        CONSTRAINT CheckConstraint18 CHECK ((SUBSTR(pesel,1,2) BETWEEN '00' AND '99') 
AND ((SUBSTR(pesel,3,2) BETWEEN '01' AND '12')
OR (SUBSTR(pesel,3,2) BETWEEN '21' AND '32'))
AND (SUBSTR(pesel,5,2) BETWEEN '01' AND '31')),
  nrTelefonu Char(9 ) NOT NULL
        CONSTRAINT CheckConstraint11 CHECK (nrTelefonu > 0)
)
/
-- Create indexes for table Klienci
CREATE INDEX Index4 ON Klienci (idKlienta)
/
-- Add keys for table Klienci
ALTER TABLE Klienci ADD CONSTRAINT Key7 PRIMARY KEY (idKlienta)
/

-- Table Oddzialy
CREATE TABLE Oddzialy(
  idOddzialu Number NOT NULL,
  kodPocztowy Char(5 ) NOT NULL
        CONSTRAINT CheckConstraint13 CHECK (kodPocztowy > 0),
  miasto Varchar2(30 ) NOT NULL,
  ulica Varchar2(30 ) NOT NULL,
  nrBudynku Varchar2(4 ) NOT NULL,
  nrLokalu Number(3,0)
        CONSTRAINT CheckConstraint14 CHECK (nrLokalu > 0)
)
/
-- Create indexes for table Oddzialy
CREATE INDEX Index5 ON Oddzialy (idOddzialu)
/
-- Add keys for table Oddzialy
ALTER TABLE Oddzialy ADD CONSTRAINT Key8 PRIMARY KEY (idOddzialu)
/

-- Table Personel
CREATE TABLE Personel(
  idPracownika Number NOT NULL,
  imie Varchar2(20 ) NOT NULL,
  drugieImie Varchar2(20 ),
  nazwisko Char(20 ) NOT NULL,
  dataUrodzenia Date NOT NULL,
  nrTelefonu Number(9,0) NOT NULL
        CONSTRAINT CheckConstraint15 CHECK (nrTelefonu > 0)
)
/
-- Create indexes for table Personel
CREATE INDEX Index6 ON Personel (idPracownika)
/
-- Add keys for table Personel
ALTER TABLE Personel ADD CONSTRAINT idPersonelu PRIMARY KEY (idPracownika)
/

-- Table Stanowiska
CREATE TABLE Stanowiska(
  funkcja Varchar2(20 ) NOT NULL
)
/
-- Add keys for table Stanowiska
ALTER TABLE Stanowiska ADD CONSTRAINT Key21 PRIMARY KEY (funkcja)
/

-- Table TypyMotocykli
CREATE TABLE TypyMotocykli(
  typ Varchar2(20 ) NOT NULL
)
/
-- Add keys for table TypyMotocykli
ALTER TABLE TypyMotocykli ADD CONSTRAINT Key9 PRIMARY KEY (typ)
/

-- Table Kolory
CREATE TABLE Kolory(
  kolor Varchar2(20 ) NOT NULL
)
/
-- Add keys for table Kolory
ALTER TABLE Kolory ADD CONSTRAINT Key10 PRIMARY KEY (kolor)
/

-- Table RodzajePaliwa
CREATE TABLE RodzajePaliwa(
  paliwo Varchar2(20 ) NOT NULL
)
/
-- Add keys for table RodzajePaliwa
ALTER TABLE RodzajePaliwa ADD CONSTRAINT Key11 PRIMARY KEY (paliwo)
/

-- Table Kraje
CREATE TABLE Kraje(
  kraj Varchar2(20 ) NOT NULL
)
/
-- Add keys for table Kraje
ALTER TABLE Kraje ADD CONSTRAINT Key13 PRIMARY KEY (kraj)
/

-- Table DostEgzemplarza
CREATE TABLE DostEgzemplarza(
  nrSeryjny Varchar2(20 ) NOT NULL,
  idOddzialu Number NOT NULL
)
/
-- Add keys for table DostEgzemplarza
ALTER TABLE DostEgzemplarza ADD CONSTRAINT Key14 PRIMARY KEY (nrSeryjny)
/

-- Table Zatrudnienia
CREATE TABLE Zatrudnienia(
  idPracownika Number NOT NULL,
  idOddzialu Number NOT NULL,
  funkcja Varchar2(20 ) NOT NULL,
  pensja Number(7,2) NOT NULL
        CONSTRAINT CheckConstraint12 CHECK (pensja > 0),
  zatrudnionyOd Date DEFAULT SYSDATE NOT NULL,
  zatrudnionyDo Date
)
/
-- Add keys for table Zatrudnienia
ALTER TABLE Zatrudnienia ADD CONSTRAINT Key15 PRIMARY KEY (idOddzialu,idPracownika)
/

-- Table Zamowienia
CREATE TABLE Zamowienia(
  idZamowienia Number NOT NULL,
  idKlienta Number NOT NULL,
  nrSeryjny Varchar2(20 ) NOT NULL,
  idPracownika Number NOT NULL,
  idOddzialu Number NOT NULL,
  dataZamowienia Date DEFAULT SYSDATE NOT NULL,
  doOdbioru Date NOT NULL,
  cena Number(8,2) NOT NULL,
  zaliczka Number(8,2) DEFAULT 0 NOT NULL,
  CONSTRAINT CheckConstraint7 CHECK (cena > 0)
)
/
-- Create indexes for table Zamowienia
CREATE INDEX Index2 ON Zamowienia (idZamowienia)
/
-- Add keys for table Zamowienia
ALTER TABLE Zamowienia ADD CONSTRAINT Key18 PRIMARY KEY (idZamowienia)
/

-- Table Rezygnacje
CREATE TABLE Rezygnacje(
  idZamowienia Number NOT NULL,
  dataRezygnacji Date DEFAULT SYSDATE NOT NULL,
  powod Varchar2(255 )
)
/
-- Add keys for table Rezygnacje
ALTER TABLE Rezygnacje ADD CONSTRAINT Key19 PRIMARY KEY (idZamowienia)
/

-- Table KonkretnyEgzemplarz
CREATE TABLE KonkretnyEgzemplarz(
  nrSeryjny Varchar2(20 ) NOT NULL,
  idMotocyklu Number NOT NULL,
  dostepny Char(1 ) DEFAULT 't' NOT NULL
        CONSTRAINT CheckConstraint16 CHECK (dostepny IN ('t','n','r'))
)
/
-- Add keys for table KonkretnyEgzemplarz
ALTER TABLE KonkretnyEgzemplarz ADD CONSTRAINT Key20 PRIMARY KEY (nrSeryjny)
/

-- Table Silniki
CREATE TABLE Silniki(
  idSilnika Number NOT NULL,
  paliwo Varchar2(20 ) NOT NULL,
  typ Char(9 ) NOT NULL
        CONSTRAINT CheckConstraint17 CHECK (typ IN ('dwusuw','czterosuw')),
  pojSilnika Number(4,0) NOT NULL
        CONSTRAINT CheckConstraint19 CHECK (pojSilnika > 0),
  mocSilnika Number(3,0) NOT NULL
        CONSTRAINT CheckConstraint20 CHECK (mocSilnika > 0),
  spalanie Number(3,1) NOT NULL
        CONSTRAINT CheckConstraint21 CHECK (spalanie > 0)
)
/
-- Add keys for table Silniki
ALTER TABLE Silniki ADD CONSTRAINT Key22 PRIMARY KEY (idSilnika)
/

-- Trigger for sequence ID_motocyklu_seq for column idMotocyklu in table Egzemplarze ---------

CREATE OR REPLACE TRIGGER ts_Egzemplarze_ID_motocyklu__0 BEFORE INSERT
ON Egzemplarze FOR EACH ROW
BEGIN
	:new.idMotocyklu := ID_motocyklu_seq.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Egzemplarze_ID_motocyklu_0 AFTER UPDATE OF idMotocyklu
ON Egzemplarze FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idMotocyklu in table Egzemplarze as it uses sequence.');
END;
/

-- Trigger for sequence ID_klienta_seq for column idKlienta in table Klienci ---------

CREATE OR REPLACE TRIGGER ts_Klienci_ID_klienta_seq BEFORE INSERT
ON Klienci FOR EACH ROW
BEGIN
	:new.idKlienta := ID_klienta_seq.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Klienci_ID_klienta_seq AFTER UPDATE OF idKlienta
ON Klienci FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idKlienta in table Klienci as it uses sequence.');
END;
/

-- Trigger for sequence ID_oddzialu_seq for column idOddzialu in table Oddzialy ---------

CREATE OR REPLACE TRIGGER ts_Oddzialy_ID_oddzialu_seq BEFORE INSERT
ON Oddzialy FOR EACH ROW
BEGIN
	:new.idOddzialu := ID_oddzialu_seq.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Oddzialy_ID_oddzialu_seq AFTER UPDATE OF idOddzialu
ON Oddzialy FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idOddzialu in table Oddzialy as it uses sequence.');
END;
/


-- Trigger for sequence ID_personelu_seq for column idPracownika in table Personel ---------

CREATE OR REPLACE TRIGGER ts_Personel_ID_personelu_seq BEFORE INSERT
ON Personel FOR EACH ROW
BEGIN
	:new.idPracownika := ID_personelu_seq.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Personel_ID_personelu_seq AFTER UPDATE OF idPracownika
ON Personel FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idPracownika in table Personel as it uses sequence.');
END;
/

-- Trigger for sequence ID_zamowienia_trig for column idZamowienia in table Zamowienia ---------

CREATE OR REPLACE TRIGGER ts_Zamowienia_ID_zamowienia__0 BEFORE INSERT
ON Zamowienia FOR EACH ROW
BEGIN
	:new.idZamowienia := ID_zamowienia_trig.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Zamowienia_ID_zamowienia_0 AFTER UPDATE OF idZamowienia
ON Zamowienia FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idZamowienia in table Zamowienia as it uses sequence.');
END;
/

-- Trigger for sequence ID_zamowienia_trig for column idSilnika in table Silniki ---------

CREATE OR REPLACE TRIGGER ts_Silniki_ID_zamowienia_trig BEFORE INSERT
ON Silniki FOR EACH ROW
BEGIN
	:new.idSilnika := ID_zamowienia_trig.nextval;
END;
/
CREATE OR REPLACE TRIGGER tsu_Silniki_ID_zamowienia_trig AFTER UPDATE OF idSilnika
ON Silniki FOR EACH ROW
BEGIN
	RAISE_APPLICATION_ERROR(-20010,'Cannot update column idSilnika in table Silniki as it uses sequence.');
END;
/

-- Wlasne triggery zapewniajace spojnosc i integralnosc bazy danych ---------------
CREATE TRIGGER ustawNiedostepny BEFORE INSERT ON Zamowienia
FOR EACH ROW BEGIN
         UPDATE KonkretnyEgzemplarz SET dostepny = 'n' WHERE nrseryjny=(:NEW.nrSeryjny);  
END;
/
CREATE TRIGGER ustawDostepny BEFORE INSERT ON Rezygnacje 
FOR EACH ROW BEGIN
        UPDATE KonkretnyEgzemplarz SET dostepny = 't' WHERE nrSeryjny=(
               SELECT nrSeryjny FROM Zamowienia WHERE idZamowienia=(:NEW.idZamowienia));
END;
/
CREATE TRIGGER dostEgzemplarz BEFORE INSERT ON dostEgzemplarza
FOR EACH ROW BEGIN
          UPDATE KonkretnyEgzemplarz SET dostepny = 'n' WHERE nrseryjny=(:NEW.nrSeryjny);
END;
/
-- Create relationships section ------------------------------------------------- 
ALTER TABLE Motocykle ADD CONSTRAINT produkuje FOREIGN KEY (marka) REFERENCES Producenci (marka)
/
ALTER TABLE JazdyProbne ADD CONSTRAINT bioraUdzial FOREIGN KEY (idKlienta) REFERENCES Klienci (idKlienta)
/
ALTER TABLE Egzemplarze ADD CONSTRAINT jestTypu FOREIGN KEY (typ) REFERENCES TypyMotocykli (typ)
/
ALTER TABLE Producenci ADD CONSTRAINT pochodziZ FOREIGN KEY (kraj) REFERENCES Kraje (kraj)
/
ALTER TABLE Egzemplarze ADD CONSTRAINT ma FOREIGN KEY (marka, model) REFERENCES Motocykle (marka, model)
/
ALTER TABLE DostEgzemplarza ADD CONSTRAINT posiada FOREIGN KEY (idOddzialu) REFERENCES Oddzialy (idOddzialu) ON DELETE CASCADE
/
ALTER TABLE Silniki ADD CONSTRAINT naPaliwo FOREIGN KEY (paliwo) REFERENCES RodzajePaliwa (paliwo)
/
ALTER TABLE Egzemplarze ADD CONSTRAINT jestKoloru FOREIGN KEY (kolor) REFERENCES Kolory (kolor)
/
ALTER TABLE Zatrudnienia ADD CONSTRAINT jestZatrudniony FOREIGN KEY (idPracownika) REFERENCES Personel (idPracownika)
/
ALTER TABLE Zatrudnienia ADD CONSTRAINT zatrudnia FOREIGN KEY (idOddzialu) REFERENCES Oddzialy (idOddzialu)
/
ALTER TABLE JazdyProbne ADD CONSTRAINT jestWypozyczany FOREIGN KEY (nrSeryjny) REFERENCES DostEgzemplarza (nrSeryjny)
/
ALTER TABLE Rezygnacje ADD CONSTRAINT rezygnacja FOREIGN KEY (idZamowienia) REFERENCES Zamowienia (idZamowienia)
/
ALTER TABLE Zamowienia ADD CONSTRAINT zamawiaja FOREIGN KEY (idKlienta) REFERENCES Klienci (idKlienta)
/
ALTER TABLE Sprzedane ADD CONSTRAINT sprzedawane FOREIGN KEY (idZamowienia) REFERENCES Zamowienia (idZamowienia)
/
ALTER TABLE KonkretnyEgzemplarz ADD CONSTRAINT istnieje FOREIGN KEY (idMotocyklu) REFERENCES Egzemplarze (idMotocyklu)
/
ALTER TABLE Zamowienia ADD CONSTRAINT zamawiane FOREIGN KEY (nrSeryjny) REFERENCES KonkretnyEgzemplarz (nrSeryjny)
/
ALTER TABLE DostEgzemplarza ADD CONSTRAINT jestDostepny FOREIGN KEY (nrSeryjny) REFERENCES KonkretnyEgzemplarz (nrSeryjny)
/
ALTER TABLE JazdyProbne ADD CONSTRAINT organizuje FOREIGN KEY (idOddzialu, idPracownika) REFERENCES Zatrudnienia (idOddzialu, idPracownika)
/
ALTER TABLE Zamowienia ADD CONSTRAINT zamawia FOREIGN KEY (idOddzialu, idPracownika) REFERENCES Zatrudnienia (idOddzialu, idPracownika)
/
ALTER TABLE Zatrudnienia ADD CONSTRAINT naStanowisku FOREIGN KEY (funkcja) REFERENCES Stanowiska (funkcja)
/
ALTER TABLE Egzemplarze ADD CONSTRAINT maSilnik FOREIGN KEY (idSilnika) REFERENCES Silniki (idSilnika);
