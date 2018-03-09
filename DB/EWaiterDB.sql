-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Мар 09 2018 г., 08:26
-- Версия сервера: 5.5.23
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `ewaiterdb`
--
CREATE DATABASE `ewaiterdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ewaiterdb`;

-- --------------------------------------------------------

--
-- Структура таблицы `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id категории',
  `menuId` int(255) NOT NULL COMMENT 'id меню',
  `name` varchar(50) NOT NULL COMMENT 'Название категории',
  `description` varchar(500) NOT NULL DEFAULT 'no' COMMENT 'Описание категории',
  `photo` varchar(10000) NOT NULL COMMENT 'Фото категории',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `company`
--

CREATE TABLE IF NOT EXISTS `company` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id компании',
  `name` varchar(50) NOT NULL COMMENT 'Название компании',
  `login` varchar(10) NOT NULL COMMENT 'Логин компании',
  `password` varchar(16) NOT NULL COMMENT 'Пароль компании',
  `regDate` date NOT NULL COMMENT 'Дата регистрации компании',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `dish`
--

CREATE TABLE IF NOT EXISTS `dish` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id блюда',
  `categoryId` int(255) NOT NULL COMMENT 'id категории',
  `name` varchar(50) NOT NULL COMMENT 'Название блюда',
  `description` varchar(500) NOT NULL DEFAULT 'no' COMMENT 'Описание блюда',
  `weight` int(255) NOT NULL COMMENT 'Вес блюда',
  `price` int(255) NOT NULL COMMENT 'Цена блюда',
  `cookTime` varchar(15) NOT NULL COMMENT 'Время приготовления блюда',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `dishcomment`
--

CREATE TABLE IF NOT EXISTS `dishcomment` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id комментария',
  `dishId` int(255) NOT NULL COMMENT 'id блюда',
  `comment` varchar(500) NOT NULL COMMENT 'Комментарий',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время комментария',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `dishorder`
--

CREATE TABLE IF NOT EXISTS `dishorder` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id чека',
  `dishId` int(255) NOT NULL COMMENT 'id блюда в чеке',
  `orderId` int(255) NOT NULL COMMENT 'id заказа в чеке',
  `dishQuantity` int(255) NOT NULL COMMENT 'Количество блюда в чеке  ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `dishphoto`
--

CREATE TABLE IF NOT EXISTS `dishphoto` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id фото блюда',
  `dishId` int(255) NOT NULL COMMENT 'id блюда',
  `url` varchar(10000) NOT NULL COMMENT 'Адрес фото блюда',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id меню',
  `companyId` int(255) NOT NULL COMMENT 'id компании',
  `name` varchar(30) NOT NULL COMMENT 'Название меню',
  `description` varchar(500) NOT NULL DEFAULT 'no' COMMENT 'Описание меню',
  `date` date NOT NULL COMMENT 'Дата включения меню',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `order`
--

CREATE TABLE IF NOT EXISTS `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id заказа',
  `tableId` int(255) NOT NULL COMMENT 'id столика',
  `waiterId` int(255) NOT NULL COMMENT 'id официанта',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время заказа',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `table`
--

CREATE TABLE IF NOT EXISTS `table` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id столика',
  `scheme` varchar(10000) NOT NULL COMMENT 'Схема расположения столика',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `waiter`
--

CREATE TABLE IF NOT EXISTS `waiter` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id официанта',
  `firstName` varchar(50) NOT NULL COMMENT 'Имя официанта',
  `lastName` varchar(50) NOT NULL COMMENT 'Фамилия официанта',
  `login` varchar(10) NOT NULL COMMENT 'Логин официанта',
  `password` varchar(16) NOT NULL COMMENT 'Пароль официанта',
  `photo` varchar(10000) NOT NULL COMMENT 'Фото официанта',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Структура таблицы `waitercomment`
--

CREATE TABLE IF NOT EXISTS `waitercomment` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id комментария',
  `waiterId` int(255) NOT NULL COMMENT 'id официанта',
  `comment` varchar(500) NOT NULL COMMENT 'Комментарий',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время комментария',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
