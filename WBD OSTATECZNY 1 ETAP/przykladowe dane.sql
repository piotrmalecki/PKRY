insert into Kraje (kraj) values ('Niemcy')
/
insert into Kraje (kraj) values ('Japonia')
/
insert into Producenci values ('Honda','Japonia')
/
insert into Producenci values ('Audi','Niemcy')
/
insert into Producenci values ('Mazda', 'Japonia')
/
insert into Motocykle values ('AAA','Honda')
/
insert into Motocykle values ('BBB', 'Audi')
/
insert into Motocykle values ('CCC', 'Mazda');
/
insert into rodzajepaliwa values ('diesel')
/
insert into typymotocykli values ('sportowy')
/
insert into kolory values ('zielony')
/
insert into kolory values ('czerwony')
/
insert into silniki values ('1','diesel','dwusuw','790','70','7,8')
/
insert into silniki values ('1','diesel','czterosuw','1190','97','8,1')
/
insert into egzemplarze values ('1','Honda','AAA','sportowy','zielony','2','2012','570','89','123','151','40000','3','Zajebisty')
/
insert into egzemplarze values ('1','Audi','CCC','sportowy','zielony','1','2011','770','13','106','141','70000','5','Dupny')
/
insert into KonkretnyEgzemplarz (nrSeryjny, idMotocyklu) values ('NXC 555105601','1')
/
insert into KonkretnyEgzemplarz (nrSeryjny, idMotocyklu) values ('NXZ 559157125','1')
/
insert into KonkretnyEgzemplarz (nrSeryjny, idMotocyklu) values ('AD 1414141414','2')
/
insert into KonkretnyEgzemplarz (nrSeryjny, idMotocyklu) values ('Z5AD148517AUX','2')
/
insert into Stanowiska values ('sprzedawca')
/
insert into Personel values ('1','Jan','','Kowalski','77/10/30','555666777')
/
insert into Personel values ('1','Zygmunt','Maciej','Nowak','88/05/05','888999000')
/
insert into Oddzialy values ('1','05553','Warszawa','Nowowiejska','47','')
/
insert into Zatrudnienia values ('1','1','sprzedawca','3000','09/09/09','')
/
insert into Zatrudnienia values ('2','1','sprzedawca','4700','03/04/06','10/11/12')
/
insert into Klienci values ('1','Mateusz','','Filipowicz','91/10/12','01003','Warszawa','Solidarnoœci','88','38','91101200950','501141489')
/
insert into DostEgzemplarza values ('NXZ 559157125','1')
/
insert into JazdyProbne values ('1','NXZ 559157125','1','1',systimestamp,systimestamp,'Fajnie siê jechalo ale sie niestety skonczylo. Kupuje go!!!')
/
insert into Zamowienia values ('1','1','NXC 555105601','1','1',sysdate,'12/12/21','40000','0')
/
insert into Zamowienia values ('1','1','AD 1414141414','2','1','10/12/01','10/12/10','70000','2220')
/
insert into Sprzedane values ('3',sysdate)
