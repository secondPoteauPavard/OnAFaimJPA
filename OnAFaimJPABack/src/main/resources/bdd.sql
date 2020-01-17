--
-- PostgreSQL database dump
--

-- Dumped from database version 10.11
-- Dumped by pg_dump version 10.11

-- Started on 2020-01-17 12:51:11

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2837 (class 0 OID 18022)
-- Dependencies: 202
-- Data for Name: compte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.compte VALUES (1, 'W', 'admin@admin.fr', 'admin', 'admin', '0644778418', 'admin', 'client', 0);
INSERT INTO public.compte VALUES (2, 'W', 'john0@doe.fr', 'mdp', 'doe0', '0644702425', 'john0', 'client', 0);
INSERT INTO public.compte VALUES (3, 'W', 'john2@doe.fr', 'mdp', 'doe2', '0644702425', 'john2', 'client', 0);
INSERT INTO public.compte VALUES (4, 'W', 'john4@doe.fr', 'mdp', 'doe4', '0644702425', 'john4', 'client', 0);
INSERT INTO public.compte VALUES (5, 'W', 'john6@doe.fr', 'mdp', 'doe6', '0644702425', 'john6', 'client', 0);
INSERT INTO public.compte VALUES (6, 'W', 'john8@doe.fr', 'mdp', 'doe8', '0644702425', 'john8', 'client', 0);
INSERT INTO public.compte VALUES (7, 'W', 'john10@doe.fr', 'mdp', 'doe10', '0644702425', 'john10', 'client', 0);
INSERT INTO public.compte VALUES (8, 'W', 'john12@doe.fr', 'mdp', 'doe12', '0644702425', 'john12', 'client', 0);
INSERT INTO public.compte VALUES (9, 'W', 'john14@doe.fr', 'mdp', 'doe14', '0644702425', 'john14', 'client', 0);
INSERT INTO public.compte VALUES (10, 'W', 'john16@doe.fr', 'mdp', 'doe16', '0644702425', 'john16', 'client', 0);
INSERT INTO public.compte VALUES (11, 'W', 'john18@doe.fr', 'mdp', 'doe18', '0644702425', 'john18', 'client', 0);
INSERT INTO public.compte VALUES (12, 'W', 'john20@doe.fr', 'mdp', 'doe20', '0644702425', 'john20', 'client', 0);
INSERT INTO public.compte VALUES (13, 'W', 'john22@doe.fr', 'mdp', 'doe22', '0644702425', 'john22', 'client', 0);
INSERT INTO public.compte VALUES (14, 'W', 'john24@doe.fr', 'mdp', 'doe24', '0644702425', 'john24', 'client', 0);
INSERT INTO public.compte VALUES (15, 'W', 'john26@doe.fr', 'mdp', 'doe26', '0644702425', 'john26', 'client', 0);
INSERT INTO public.compte VALUES (16, 'W', 'john28@doe.fr', 'mdp', 'doe28', '0644702425', 'john28', 'client', 0);
INSERT INTO public.compte VALUES (17, 'W', 'john30@doe.fr', 'mdp', 'doe30', '0644702425', 'john30', 'client', 0);
INSERT INTO public.compte VALUES (18, 'W', 'john32@doe.fr', 'mdp', 'doe32', '0644702425', 'john32', 'client', 0);
INSERT INTO public.compte VALUES (19, 'W', 'john34@doe.fr', 'mdp', 'doe34', '0644702425', 'john34', 'client', 0);
INSERT INTO public.compte VALUES (20, 'W', 'john36@doe.fr', 'mdp', 'doe36', '0644702425', 'john36', 'client', 0);
INSERT INTO public.compte VALUES (21, 'W', 'john38@doe.fr', 'mdp', 'doe38', '0644702425', 'john38', 'client', 0);
INSERT INTO public.compte VALUES (22, 'W', 'john40@doe.fr', 'mdp', 'doe40', '0644702425', 'john40', 'client', 0);
INSERT INTO public.compte VALUES (23, 'W', 'john42@doe.fr', 'mdp', 'doe42', '0644702425', 'john42', 'client', 0);
INSERT INTO public.compte VALUES (24, 'W', 'john44@doe.fr', 'mdp', 'doe44', '0644702425', 'john44', 'client', 0);
INSERT INTO public.compte VALUES (25, 'W', 'john46@doe.fr', 'mdp', 'doe46', '0644702425', 'john46', 'client', 0);
INSERT INTO public.compte VALUES (26, 'W', 'john48@doe.fr', 'mdp', 'doe48', '0644702425', 'john48', 'client', 0);
INSERT INTO public.compte VALUES (27, 'W', 'john50@doe.fr', 'mdp', 'doe50', '0644702425', 'john50', 'client', 0);
INSERT INTO public.compte VALUES (28, 'W', 'john52@doe.fr', 'mdp', 'doe52', '0644702425', 'john52', 'client', 0);
INSERT INTO public.compte VALUES (29, 'W', 'john54@doe.fr', 'mdp', 'doe54', '0644702425', 'john54', 'client', 0);
INSERT INTO public.compte VALUES (30, 'W', 'john56@doe.fr', 'mdp', 'doe56', '0644702425', 'john56', 'client', 0);
INSERT INTO public.compte VALUES (31, 'W', 'john58@doe.fr', 'mdp', 'doe58', '0644702425', 'john58', 'client', 0);


--
-- TOC entry 2836 (class 0 OID 18017)
-- Dependencies: 201
-- Data for Name: commande; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.commande VALUES (100, 'W', 0, NULL, 0, 2);
INSERT INTO public.commande VALUES (101, 'W', 0, NULL, 0, 2);
INSERT INTO public.commande VALUES (102, 'W', 0, NULL, 0, 3);
INSERT INTO public.commande VALUES (103, 'W', 0, NULL, 0, 3);
INSERT INTO public.commande VALUES (104, 'W', 0, NULL, 0, 4);
INSERT INTO public.commande VALUES (105, 'W', 0, NULL, 0, 4);
INSERT INTO public.commande VALUES (106, 'W', 0, NULL, 0, 5);
INSERT INTO public.commande VALUES (107, 'W', 0, NULL, 0, 5);
INSERT INTO public.commande VALUES (108, 'W', 0, NULL, 0, 6);
INSERT INTO public.commande VALUES (109, 'W', 0, NULL, 0, 6);
INSERT INTO public.commande VALUES (110, 'W', 0, NULL, 0, 7);
INSERT INTO public.commande VALUES (111, 'W', 0, NULL, 0, 7);
INSERT INTO public.commande VALUES (112, 'W', 0, NULL, 0, 8);
INSERT INTO public.commande VALUES (113, 'W', 0, NULL, 0, 8);
INSERT INTO public.commande VALUES (114, 'W', 0, NULL, 0, 9);
INSERT INTO public.commande VALUES (115, 'W', 0, NULL, 0, 9);
INSERT INTO public.commande VALUES (116, 'W', 0, NULL, 0, 10);
INSERT INTO public.commande VALUES (117, 'W', 0, NULL, 0, 10);
INSERT INTO public.commande VALUES (118, 'W', 0, NULL, 0, 11);
INSERT INTO public.commande VALUES (119, 'W', 0, NULL, 0, 11);
INSERT INTO public.commande VALUES (120, 'W', 0, NULL, 0, 12);
INSERT INTO public.commande VALUES (121, 'W', 0, NULL, 0, 12);
INSERT INTO public.commande VALUES (122, 'W', 0, NULL, 0, 13);
INSERT INTO public.commande VALUES (123, 'W', 0, NULL, 0, 13);
INSERT INTO public.commande VALUES (124, 'W', 0, NULL, 0, 14);
INSERT INTO public.commande VALUES (125, 'W', 0, NULL, 0, 14);
INSERT INTO public.commande VALUES (126, 'W', 0, NULL, 0, 15);
INSERT INTO public.commande VALUES (127, 'W', 0, NULL, 0, 15);
INSERT INTO public.commande VALUES (128, 'W', 0, NULL, 0, 16);
INSERT INTO public.commande VALUES (129, 'W', 0, NULL, 0, 16);
INSERT INTO public.commande VALUES (130, 'W', 0, NULL, 0, 17);
INSERT INTO public.commande VALUES (131, 'W', 0, NULL, 0, 17);
INSERT INTO public.commande VALUES (132, 'W', 0, NULL, 0, 18);
INSERT INTO public.commande VALUES (133, 'W', 0, NULL, 0, 18);
INSERT INTO public.commande VALUES (134, 'W', 0, NULL, 0, 19);
INSERT INTO public.commande VALUES (135, 'W', 0, NULL, 0, 19);
INSERT INTO public.commande VALUES (136, 'W', 0, NULL, 0, 20);
INSERT INTO public.commande VALUES (137, 'W', 0, NULL, 0, 20);
INSERT INTO public.commande VALUES (138, 'W', 0, NULL, 0, 21);
INSERT INTO public.commande VALUES (139, 'W', 0, NULL, 0, 21);
INSERT INTO public.commande VALUES (140, 'W', 0, NULL, 0, 22);
INSERT INTO public.commande VALUES (141, 'W', 0, NULL, 0, 22);
INSERT INTO public.commande VALUES (142, 'W', 0, NULL, 0, 23);
INSERT INTO public.commande VALUES (143, 'W', 0, NULL, 0, 23);
INSERT INTO public.commande VALUES (144, 'W', 0, NULL, 0, 24);
INSERT INTO public.commande VALUES (145, 'W', 0, NULL, 0, 24);
INSERT INTO public.commande VALUES (146, 'W', 0, NULL, 0, 25);
INSERT INTO public.commande VALUES (147, 'W', 0, NULL, 0, 25);
INSERT INTO public.commande VALUES (148, 'W', 0, NULL, 0, 26);
INSERT INTO public.commande VALUES (149, 'W', 0, NULL, 0, 26);
INSERT INTO public.commande VALUES (150, 'W', 0, NULL, 0, 27);
INSERT INTO public.commande VALUES (151, 'W', 0, NULL, 0, 27);
INSERT INTO public.commande VALUES (152, 'W', 0, NULL, 0, 28);
INSERT INTO public.commande VALUES (153, 'W', 0, NULL, 0, 28);
INSERT INTO public.commande VALUES (154, 'W', 0, NULL, 0, 29);
INSERT INTO public.commande VALUES (155, 'W', 0, NULL, 0, 29);
INSERT INTO public.commande VALUES (156, 'W', 0, NULL, 0, 30);
INSERT INTO public.commande VALUES (157, 'W', 0, NULL, 0, 30);
INSERT INTO public.commande VALUES (158, 'W', 0, NULL, 0, 31);
INSERT INTO public.commande VALUES (159, 'W', 0, NULL, 0, 31);


--
-- TOC entry 2838 (class 0 OID 18030)
-- Dependencies: 203
-- Data for Name: devis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.devis VALUES (100, 'W', 0, NULL, NULL, 0, 2);
INSERT INTO public.devis VALUES (101, 'W', 0, NULL, NULL, 0, 2);
INSERT INTO public.devis VALUES (102, 'W', 0, NULL, NULL, 0, 3);
INSERT INTO public.devis VALUES (103, 'W', 0, NULL, NULL, 0, 3);
INSERT INTO public.devis VALUES (104, 'W', 0, NULL, NULL, 0, 4);
INSERT INTO public.devis VALUES (105, 'W', 0, NULL, NULL, 0, 4);
INSERT INTO public.devis VALUES (106, 'W', 0, NULL, NULL, 0, 5);
INSERT INTO public.devis VALUES (107, 'W', 0, NULL, NULL, 0, 5);
INSERT INTO public.devis VALUES (108, 'W', 0, NULL, NULL, 0, 6);
INSERT INTO public.devis VALUES (109, 'W', 0, NULL, NULL, 0, 6);
INSERT INTO public.devis VALUES (110, 'W', 0, NULL, NULL, 0, 7);
INSERT INTO public.devis VALUES (111, 'W', 0, NULL, NULL, 0, 7);
INSERT INTO public.devis VALUES (112, 'W', 0, NULL, NULL, 0, 8);
INSERT INTO public.devis VALUES (113, 'W', 0, NULL, NULL, 0, 8);
INSERT INTO public.devis VALUES (114, 'W', 0, NULL, NULL, 0, 9);
INSERT INTO public.devis VALUES (115, 'W', 0, NULL, NULL, 0, 9);
INSERT INTO public.devis VALUES (116, 'W', 0, NULL, NULL, 0, 10);
INSERT INTO public.devis VALUES (117, 'W', 0, NULL, NULL, 0, 10);
INSERT INTO public.devis VALUES (118, 'W', 0, NULL, NULL, 0, 11);
INSERT INTO public.devis VALUES (119, 'W', 0, NULL, NULL, 0, 11);
INSERT INTO public.devis VALUES (120, 'W', 0, NULL, NULL, 0, 12);
INSERT INTO public.devis VALUES (121, 'W', 0, NULL, NULL, 0, 12);
INSERT INTO public.devis VALUES (122, 'W', 0, NULL, NULL, 0, 13);
INSERT INTO public.devis VALUES (123, 'W', 0, NULL, NULL, 0, 13);
INSERT INTO public.devis VALUES (124, 'W', 0, NULL, NULL, 0, 14);
INSERT INTO public.devis VALUES (125, 'W', 0, NULL, NULL, 0, 14);
INSERT INTO public.devis VALUES (126, 'W', 0, NULL, NULL, 0, 15);
INSERT INTO public.devis VALUES (127, 'W', 0, NULL, NULL, 0, 15);
INSERT INTO public.devis VALUES (128, 'W', 0, NULL, NULL, 0, 16);
INSERT INTO public.devis VALUES (129, 'W', 0, NULL, NULL, 0, 16);
INSERT INTO public.devis VALUES (130, 'W', 0, NULL, NULL, 0, 17);
INSERT INTO public.devis VALUES (131, 'W', 0, NULL, NULL, 0, 17);
INSERT INTO public.devis VALUES (132, 'W', 0, NULL, NULL, 0, 18);
INSERT INTO public.devis VALUES (133, 'W', 0, NULL, NULL, 0, 18);
INSERT INTO public.devis VALUES (134, 'W', 0, NULL, NULL, 0, 19);
INSERT INTO public.devis VALUES (135, 'W', 0, NULL, NULL, 0, 19);
INSERT INTO public.devis VALUES (136, 'W', 0, NULL, NULL, 0, 20);
INSERT INTO public.devis VALUES (137, 'W', 0, NULL, NULL, 0, 20);
INSERT INTO public.devis VALUES (138, 'W', 0, NULL, NULL, 0, 21);
INSERT INTO public.devis VALUES (139, 'W', 0, NULL, NULL, 0, 21);
INSERT INTO public.devis VALUES (140, 'W', 0, NULL, NULL, 0, 22);
INSERT INTO public.devis VALUES (141, 'W', 0, NULL, NULL, 0, 22);
INSERT INTO public.devis VALUES (142, 'W', 0, NULL, NULL, 0, 23);
INSERT INTO public.devis VALUES (143, 'W', 0, NULL, NULL, 0, 23);
INSERT INTO public.devis VALUES (144, 'W', 0, NULL, NULL, 0, 24);
INSERT INTO public.devis VALUES (145, 'W', 0, NULL, NULL, 0, 24);
INSERT INTO public.devis VALUES (146, 'W', 0, NULL, NULL, 0, 25);
INSERT INTO public.devis VALUES (147, 'W', 0, NULL, NULL, 0, 25);
INSERT INTO public.devis VALUES (148, 'W', 0, NULL, NULL, 0, 26);
INSERT INTO public.devis VALUES (149, 'W', 0, NULL, NULL, 0, 26);
INSERT INTO public.devis VALUES (150, 'W', 0, NULL, NULL, 0, 27);
INSERT INTO public.devis VALUES (151, 'W', 0, NULL, NULL, 0, 27);
INSERT INTO public.devis VALUES (152, 'W', 0, NULL, NULL, 0, 28);
INSERT INTO public.devis VALUES (153, 'W', 0, NULL, NULL, 0, 28);
INSERT INTO public.devis VALUES (154, 'W', 0, NULL, NULL, 0, 29);
INSERT INTO public.devis VALUES (155, 'W', 0, NULL, NULL, 0, 29);
INSERT INTO public.devis VALUES (156, 'W', 0, NULL, NULL, 0, 30);
INSERT INTO public.devis VALUES (157, 'W', 0, NULL, NULL, 0, 30);
INSERT INTO public.devis VALUES (158, 'W', 0, NULL, NULL, 0, 31);
INSERT INTO public.devis VALUES (159, 'W', 0, NULL, NULL, 0, 31);


--
-- TOC entry 2840 (class 0 OID 18040)
-- Dependencies: 205
-- Data for Name: produit; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produit VALUES (1, NULL, 'choco0', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (2, NULL, 'choco1', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (3, NULL, 'choco2', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (4, NULL, 'choco3', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (5, NULL, 'choco4', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (6, NULL, 'choco5', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (7, NULL, 'choco6', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (8, NULL, 'choco7', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (9, NULL, 'choco8', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (10, NULL, 'choco9', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (11, NULL, 'choco10', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (12, NULL, 'choco11', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (13, NULL, 'choco12', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (14, NULL, 'choco13', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (15, NULL, 'choco14', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (16, NULL, 'choco15', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (17, NULL, 'choco16', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (18, NULL, 'choco17', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (19, NULL, 'choco18', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (20, NULL, 'choco19', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (21, NULL, 'choco20', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (22, NULL, 'choco21', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (23, NULL, 'choco22', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (24, NULL, 'choco23', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (25, NULL, 'choco24', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (26, NULL, 'choco25', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (27, NULL, 'choco26', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (28, NULL, 'choco27', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (29, NULL, 'choco28', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (30, NULL, 'choco29', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (31, NULL, 'choco30', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (32, NULL, 'choco31', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (33, NULL, 'choco32', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (34, NULL, 'choco33', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (35, NULL, 'choco34', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (36, NULL, 'choco35', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (37, NULL, 'choco36', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (38, NULL, 'choco37', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (39, NULL, 'choco38', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (40, NULL, 'choco39', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (41, NULL, 'choco40', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (42, NULL, 'choco41', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (43, NULL, 'choco42', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (44, NULL, 'choco43', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (45, NULL, 'choco44', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (46, NULL, 'choco45', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (47, NULL, 'choco46', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (48, NULL, 'choco47', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (49, NULL, 'choco48', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (50, NULL, 'choco49', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (51, NULL, 'choco50', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (52, NULL, 'choco51', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (53, NULL, 'choco52', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (54, NULL, 'choco53', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (55, NULL, 'choco54', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (56, NULL, 'choco55', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (57, NULL, 'choco56', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (58, NULL, 'choco57', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (59, NULL, 'choco58', NULL, 0, NULL, NULL);
INSERT INTO public.produit VALUES (60, NULL, 'choco59', NULL, 0, NULL, NULL);


--
-- TOC entry 2839 (class 0 OID 18035)
-- Dependencies: 204
-- Data for Name: ligne_commande; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.ligne_commande VALUES (10, 0, 100, 1);
INSERT INTO public.ligne_commande VALUES (8, 0, 101, 2);
INSERT INTO public.ligne_commande VALUES (4, 0, 102, 3);
INSERT INTO public.ligne_commande VALUES (9, 0, 103, 4);
INSERT INTO public.ligne_commande VALUES (3, 0, 104, 5);
INSERT INTO public.ligne_commande VALUES (8, 0, 105, 6);
INSERT INTO public.ligne_commande VALUES (1, 0, 106, 7);
INSERT INTO public.ligne_commande VALUES (6, 0, 107, 8);
INSERT INTO public.ligne_commande VALUES (6, 0, 108, 9);
INSERT INTO public.ligne_commande VALUES (10, 0, 109, 10);
INSERT INTO public.ligne_commande VALUES (8, 0, 110, 11);
INSERT INTO public.ligne_commande VALUES (8, 0, 111, 12);
INSERT INTO public.ligne_commande VALUES (5, 0, 112, 13);
INSERT INTO public.ligne_commande VALUES (10, 0, 113, 14);
INSERT INTO public.ligne_commande VALUES (4, 0, 114, 15);
INSERT INTO public.ligne_commande VALUES (10, 0, 115, 16);
INSERT INTO public.ligne_commande VALUES (10, 0, 116, 17);
INSERT INTO public.ligne_commande VALUES (7, 0, 117, 18);
INSERT INTO public.ligne_commande VALUES (2, 0, 118, 19);
INSERT INTO public.ligne_commande VALUES (5, 0, 119, 20);
INSERT INTO public.ligne_commande VALUES (7, 0, 120, 21);
INSERT INTO public.ligne_commande VALUES (9, 0, 121, 22);
INSERT INTO public.ligne_commande VALUES (2, 0, 122, 23);
INSERT INTO public.ligne_commande VALUES (3, 0, 123, 24);
INSERT INTO public.ligne_commande VALUES (1, 0, 124, 25);
INSERT INTO public.ligne_commande VALUES (4, 0, 125, 26);
INSERT INTO public.ligne_commande VALUES (8, 0, 126, 27);
INSERT INTO public.ligne_commande VALUES (10, 0, 127, 28);
INSERT INTO public.ligne_commande VALUES (5, 0, 128, 29);
INSERT INTO public.ligne_commande VALUES (3, 0, 129, 30);
INSERT INTO public.ligne_commande VALUES (3, 0, 130, 31);
INSERT INTO public.ligne_commande VALUES (9, 0, 131, 32);
INSERT INTO public.ligne_commande VALUES (5, 0, 132, 33);
INSERT INTO public.ligne_commande VALUES (9, 0, 133, 34);
INSERT INTO public.ligne_commande VALUES (4, 0, 134, 35);
INSERT INTO public.ligne_commande VALUES (3, 0, 135, 36);
INSERT INTO public.ligne_commande VALUES (1, 0, 136, 37);
INSERT INTO public.ligne_commande VALUES (8, 0, 137, 38);
INSERT INTO public.ligne_commande VALUES (7, 0, 138, 39);
INSERT INTO public.ligne_commande VALUES (3, 0, 139, 40);
INSERT INTO public.ligne_commande VALUES (2, 0, 140, 41);
INSERT INTO public.ligne_commande VALUES (8, 0, 141, 42);
INSERT INTO public.ligne_commande VALUES (5, 0, 142, 43);
INSERT INTO public.ligne_commande VALUES (5, 0, 143, 44);
INSERT INTO public.ligne_commande VALUES (1, 0, 144, 45);
INSERT INTO public.ligne_commande VALUES (7, 0, 145, 46);
INSERT INTO public.ligne_commande VALUES (9, 0, 146, 47);
INSERT INTO public.ligne_commande VALUES (1, 0, 147, 48);
INSERT INTO public.ligne_commande VALUES (5, 0, 148, 49);
INSERT INTO public.ligne_commande VALUES (4, 0, 149, 50);
INSERT INTO public.ligne_commande VALUES (7, 0, 150, 51);
INSERT INTO public.ligne_commande VALUES (9, 0, 151, 52);
INSERT INTO public.ligne_commande VALUES (8, 0, 152, 53);
INSERT INTO public.ligne_commande VALUES (10, 0, 153, 54);
INSERT INTO public.ligne_commande VALUES (7, 0, 154, 55);
INSERT INTO public.ligne_commande VALUES (1, 0, 155, 56);
INSERT INTO public.ligne_commande VALUES (4, 0, 156, 57);
INSERT INTO public.ligne_commande VALUES (9, 0, 157, 58);
INSERT INTO public.ligne_commande VALUES (3, 0, 158, 59);
INSERT INTO public.ligne_commande VALUES (8, 0, 159, 60);


--
-- TOC entry 2846 (class 0 OID 0)
-- Dependencies: 196
-- Name: seq_account; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_account', 1, true);


--
-- TOC entry 2847 (class 0 OID 0)
-- Dependencies: 197
-- Name: seq_commande; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_commande', 159, true);


--
-- TOC entry 2848 (class 0 OID 0)
-- Dependencies: 198
-- Name: seq_compte; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_compte', 31, true);


--
-- TOC entry 2849 (class 0 OID 0)
-- Dependencies: 199
-- Name: seq_devis; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_devis', 159, true);


--
-- TOC entry 2850 (class 0 OID 0)
-- Dependencies: 200
-- Name: seq_produit; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.seq_produit', 60, true);


-- Completed on 2020-01-17 12:51:12

--
-- PostgreSQL database dump complete
--

