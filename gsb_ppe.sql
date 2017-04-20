-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Jeu 20 Avril 2017 à 12:20
-- Version du serveur :  5.7.15-0ubuntu0.16.04.1
-- Version de PHP :  7.0.8-0ubuntu0.16.04.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gsb_ppe`
--

-- --------------------------------------------------------

--
-- Structure de la table `compose`
--

CREATE TABLE `compose` (
  `quantite` int(11) DEFAULT NULL,
  `id_medicament` int(11) NOT NULL,
  `id_echantillon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `compose`
--

INSERT INTO `compose` (`quantite`, `id_medicament`, `id_echantillon`) VALUES
(3, 1, 1),
(3, 1, 2),
(2, 1, 3),
(5, 1, 4),
(3, 1, 5);

-- --------------------------------------------------------

--
-- Structure de la table `echantillon`
--

CREATE TABLE `echantillon` (
  `id_echantillon` int(11) NOT NULL,
  `ref_echantillon` varchar(255) NOT NULL,
  `id_rapport` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `echantillon`
--

INSERT INTO `echantillon` (`id_echantillon`, `ref_echantillon`, `id_rapport`) VALUES
(1, 'ref_5826785', 1),
(2, 'ref_8060308', 3),
(3, 'ref_2028001', 4),
(4, 'ref_3037222', 5),
(5, 'ref_5260176', 8);

-- --------------------------------------------------------

--
-- Structure de la table `medicament`
--

CREATE TABLE `medicament` (
  `id_medicament` int(11) NOT NULL,
  `denomination` varchar(255) DEFAULT NULL,
  `laboratoire` varchar(55) NOT NULL,
  `quantiteStock` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `medicament`
--

INSERT INTO `medicament` (`id_medicament`, `denomination`, `laboratoire`, `quantiteStock`) VALUES
(1, 'FormaXor', 'Xenius', 120);

-- --------------------------------------------------------

--
-- Structure de la table `praticien`
--

CREATE TABLE `praticien` (
  `id_praticien` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `adresse` varchar(55) DEFAULT NULL,
  `ville` varchar(25) DEFAULT NULL,
  `code_postal` varchar(25) DEFAULT NULL,
  `telephone` varchar(25) DEFAULT NULL,
  `secteur` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `praticien`
--

INSERT INTO `praticien` (`id_praticien`, `nom`, `prenom`, `adresse`, `ville`, `code_postal`, `telephone`, `secteur`) VALUES
(1, 'Dubois', 'Paul', '87 avenue des champs', 'Marseille', '13052', '02 36 36 24 45', '52U4');

-- --------------------------------------------------------

--
-- Structure de la table `rapportdevisite`
--

CREATE TABLE `rapportdevisite` (
  `id_rapport` int(11) NOT NULL,
  `motifvisite` varchar(255) DEFAULT NULL,
  `bilan` text,
  `date_visite` date DEFAULT NULL,
  `id_visiteur` int(11) DEFAULT NULL,
  `id_praticien` int(11) DEFAULT NULL,
  `id_echantillon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `rapportdevisite`
--

INSERT INTO `rapportdevisite` (`id_rapport`, `motifvisite`, `bilan`, `date_visite`, `id_visiteur`, `id_praticien`, `id_echantillon`) VALUES
(8, 'Praticien intéressé par les\n anti-dépresseur', 'Première visite', '2017-04-21', 6, 1, 5);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `id_role` int(11) NOT NULL,
  `nom_role` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `role`
--

INSERT INTO `role` (`id_role`, `nom_role`) VALUES
(1, 'Visiteur Médical'),
(2, 'Administrateur');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id_utilisateur` int(11) NOT NULL,
  `login` varchar(25) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `id_role` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id_utilisateur`, `login`, `password`, `email`, `id_role`) VALUES
(1, 'admin', '$2a$11$rvQqLgfZ7REChoZlRBrn.uAYWNdwozEYUegJ.QJzUZkWeiVUO0Nxa', 'admin@gsb.fr', 2),
(18, 'visiteur', '$2a$11$hsWHbqD1Boj1wNOMeG8Tzued3tzF.qO86bRV0GMzV3Jeb18Bqo3zG', 'visiteur@visiteur.fr', 1);

-- --------------------------------------------------------

--
-- Structure de la table `visiteurmedical`
--

CREATE TABLE `visiteurmedical` (
  `id_visiteur` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(25) DEFAULT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `secteur` varchar(255) DEFAULT NULL,
  `labo` varchar(25) DEFAULT NULL,
  `id_utilisateur` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `visiteurmedical`
--

INSERT INTO `visiteurmedical` (`id_visiteur`, `nom`, `prenom`, `adresse`, `ville`, `secteur`, `labo`, `id_utilisateur`) VALUES
(6, 'Boulis', 'Marcus', '14 avenue Boutantrain', 'Aubagne', '54U4', 'Xenius', 18);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `compose`
--
ALTER TABLE `compose`
  ADD PRIMARY KEY (`id_medicament`,`id_echantillon`),
  ADD KEY `id_echantillon` (`id_echantillon`);

--
-- Index pour la table `echantillon`
--
ALTER TABLE `echantillon`
  ADD PRIMARY KEY (`id_echantillon`);

--
-- Index pour la table `medicament`
--
ALTER TABLE `medicament`
  ADD PRIMARY KEY (`id_medicament`);

--
-- Index pour la table `praticien`
--
ALTER TABLE `praticien`
  ADD PRIMARY KEY (`id_praticien`);

--
-- Index pour la table `rapportdevisite`
--
ALTER TABLE `rapportdevisite`
  ADD PRIMARY KEY (`id_rapport`),
  ADD KEY `id_visiteur` (`id_visiteur`),
  ADD KEY `id_praticien` (`id_praticien`),
  ADD KEY `id_echantillon` (`id_echantillon`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id_role`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id_utilisateur`),
  ADD KEY `id_role` (`id_role`);

--
-- Index pour la table `visiteurmedical`
--
ALTER TABLE `visiteurmedical`
  ADD PRIMARY KEY (`id_visiteur`),
  ADD KEY `visiteurmedical_ibfk_1` (`id_utilisateur`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `echantillon`
--
ALTER TABLE `echantillon`
  MODIFY `id_echantillon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT pour la table `medicament`
--
ALTER TABLE `medicament`
  MODIFY `id_medicament` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `praticien`
--
ALTER TABLE `praticien`
  MODIFY `id_praticien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT pour la table `rapportdevisite`
--
ALTER TABLE `rapportdevisite`
  MODIFY `id_rapport` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT pour la table `role`
--
ALTER TABLE `role`
  MODIFY `id_role` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id_utilisateur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT pour la table `visiteurmedical`
--
ALTER TABLE `visiteurmedical`
  MODIFY `id_visiteur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `compose`
--
ALTER TABLE `compose`
  ADD CONSTRAINT `compose_ibfk_1` FOREIGN KEY (`id_medicament`) REFERENCES `medicament` (`id_medicament`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `rapportdevisite`
--
ALTER TABLE `rapportdevisite`
  ADD CONSTRAINT `echantillon_frk` FOREIGN KEY (`id_echantillon`) REFERENCES `echantillon` (`id_echantillon`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `praticien_frk` FOREIGN KEY (`id_praticien`) REFERENCES `praticien` (`id_praticien`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `visiteur_frk` FOREIGN KEY (`id_visiteur`) REFERENCES `visiteurmedical` (`id_visiteur`);

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `role_frk` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `visiteurmedical`
--
ALTER TABLE `visiteurmedical`
  ADD CONSTRAINT `user_frk` FOREIGN KEY (`id_utilisateur`) REFERENCES `utilisateur` (`id_utilisateur`) ON DELETE SET NULL ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
