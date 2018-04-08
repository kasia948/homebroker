INSERT INTO developer (id, description, logourl, name) VALUES (1, 'Szybko i tanio', 'https://pewnylokal.pl/sprawdz-dewelopera/media/dom-development.jpeg', 'Dom Development');
INSERT INTO developer (id, description, logourl, name) VALUES (2, 'Pelen profesjonalizm', 'http://domy-lomianki.com/wp-content/themes/oktawian/img/domy-lomianki-logo.png', 'Domy-OK');
INSERT INTO developer (id, description, logourl, name) VALUES (3, 'Solidna firma z tradycja', 'http://www.deweloper-szczecin.pl/wp-content/uploads/2017/01/logo-menu.svg', 'Budom');
INSERT INTO developer (id, description, logourl, name) VALUES (4, 'Z nami wybudujesz swój wymarzony dom', 'https://www.enervent.com/wp-content/uploads/2016/06/logo-PERSPECTIVE-607x399.jpg', 'Dom Marzen');

INSERT INTO developer_details (id, nip, regon, address) VALUES (1, 985621458, 3695, 'Akacjowa 1, Wroclaw');
INSERT INTO developer_details (id, nip, regon, address) VALUES (2, 584221561, 5485, 'Poranna 52, Smolec');
INSERT INTO developer_details (id, nip, regon, address) VALUES (3, 125846214, 2222, 'Zieby 16, Katy Wroclawskie');
INSERT INTO developer_details (id, nip, regon, address) VALUES (4, 485125486, 1111, 'Kolista 25, Swieta Katarzyna');

INSERT INTO investment (id, name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (1, 'Osiedle Sloneczne', 'Wroclaw', 2018, 10, 15, 'Sloneczne osiedle z infrastruktura handlowo-uslugowa', 12, 'Lesna', 'http://adrespoznan.pl/wp-content/uploads/2015/09/osiedle-wilczak-20-agrobex-nowe-mieszkania-poznan.jpg',1 );
INSERT INTO investment (id, name, city, deadline_year, deadline_month, deadline_day,  description, number, street, www, developer_id) VALUES (2, 'Przy Lipach' ,'Smolec', 2019, 10, 01, 'Zabudowa szeregowa, domy z duzym ogrodem', 25, 'Koscielna', 'http://e3architekci.pl/wp-content/uploads/2016/04/OSSS_1-1024x727.jpg',2 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (3, 'Rodzinny zakatek','Katy Wroclawskie', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Lesna', 'http://www.kokoszki.pl/images/grid/grid6.jpg',3 );

INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (4, 'Pory roku ','Mirkow', 2022, 04, 01, 'Idealne osiedle dla pracujacych we Wroclawiu. Dobry dojazd', 52, 'Azaliowa', 'http://www.kokoszki.pl/images/grid/grid6.jpg',4 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (5, 'Rozaw wiatrow','Zakrzowe', 2019, 01, 01, 'Zabudowa wielorodzinna', 51, 'Zamojska', 'http://www.kokoszki.pl/images/grid/grid6.jpg',1 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (6, 'Osiedle odkrywcow','Maslice', 2019, 02, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Stablowicka', 'http://www.kokoszki.pl/images/grid/grid6.jpg',2 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (7, 'Kosmonautow','Lesnica', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Maslicka', 'http://www.kokoszki.pl/images/grid/grid6.jpg',3 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (8, 'Osiedle podmiejskie','Siechnice', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Lesna', 'http://www.kokoszki.pl/images/grid/grid6.jpg',4 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (9, 'Osiedle Vivaldiego','Piotrowice', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Lesna', 'http://www.kokoszki.pl/images/grid/grid6.jpg',1 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (10, 'Osiedle lesna polana','Wilkszyn', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Wroclawska', 'http://www.kokoszki.pl/images/grid/grid6.jpg',2 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (11, 'Osiedle Ciche','Dlugoleka', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Lesna', 'http://www.kokoszki.pl/images/grid/grid6.jpg',3 );
INSERT INTO investment (id,name, city, deadline_year, deadline_month, deadline_day, description, number, street, www, developer_id) VALUES (12, 'Osiedle Polanka','Wroclaw', 2020, 01, 01, 'Sloneczne osiedle, zabudowa wielorodzinna', 12, 'Polanka', 'http://www.kokoszki.pl/images/grid/grid6.jpg',4 );

INSERT INTO offer_apartment (id, urlplan, description, floor, is_promoted, offer_apartment_status, price, rooms_number, surface, investment_id) VALUES (1,'http://1.bp.blogspot.com/-WAMgkyCUiuY/TdJY7p_WqJI/AAAAAAAAAj0/QE4Jk3P7XKg/s1600/plan.png', 'Przestronne mieszkanie na parterze', 0, 1, 'SOLD', 230000, 3, 50, 1);

INSERT INTO offer_apartment (id, urlplan, description, floor, is_promoted, offer_apartment_status, price, rooms_number, surface, investment_id)
VALUES (2,'http://bi.gazeta.pl/im/1f/69/12/z19307039Q,W-mieszkaniu-wydzielilam-trzeci-pokoj---na-razie-m.jpg', 'Idelane dla mlodego malzenstwa', 2, 1, 'RESERVED', 30000, 2, 48, 1);
INSERT INTO offer_apartment (id, urlplan, description, floor, is_promoted, offer_apartment_status, price, rooms_number, surface, investment_id) VALUES (3,'http://zswp.webd.pl/tlenart/wp-content/uploads/2013/02/spjplankl64.png', 'Przytulne 4M', 6, 0, 'AVAILABLE', 230000, 4, 50, 1);

