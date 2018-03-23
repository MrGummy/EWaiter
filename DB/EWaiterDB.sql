-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Мар 23 2018 г., 10:55
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
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`menuId`),
  KEY `menuId` (`menuId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `category`
--

INSERT INTO `category` (`id`, `menuId`, `name`, `description`, `photo`) VALUES
(1, 1, 'Супы', 'no', 'resources/images/1'),
(2, 1, 'Гарниры', 'no', 'resources/images/2');

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
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `company`
--

INSERT INTO `company` (`id`, `name`, `login`, `password`, `regDate`) VALUES
(1, 'testCompany', '123', '123', '2018-03-09');

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
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`categoryId`),
  KEY `categoryId` (`categoryId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `dish`
--

INSERT INTO `dish` (`id`, `categoryId`, `name`, `description`, `weight`, `price`, `cookTime`) VALUES
(1, 1, 'Борщ', 'no', 200, 120, '15 мин.'),
(2, 2, 'Рис', 'no', 150, 80, '10 мин.');

-- --------------------------------------------------------

--
-- Структура таблицы `dishcomment`
--

CREATE TABLE IF NOT EXISTS `dishcomment` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id комментария',
  `dishId` int(255) NOT NULL COMMENT 'id блюда',
  `comment` varchar(500) NOT NULL COMMENT 'Комментарий',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время комментария',
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`dishId`),
  KEY `dishId` (`dishId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `dishcomment`
--

INSERT INTO `dishcomment` (`id`, `dishId`, `comment`, `dateTime`) VALUES
(1, 2, 'Рис слипшийся', '2018-03-14 13:24:04');

-- --------------------------------------------------------

--
-- Структура таблицы `dishorder`
--

CREATE TABLE IF NOT EXISTS `dishorder` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id чека',
  `dishId` int(255) NOT NULL COMMENT 'id блюда в чеке',
  `orderId` int(255) NOT NULL COMMENT 'id заказа в чеке',
  `dishQuantity` int(255) NOT NULL COMMENT 'Количество блюда в чеке  ',
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`dishId`,`orderId`),
  KEY `dishId` (`dishId`),
  KEY `orderId` (`orderId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `dishorder`
--

INSERT INTO `dishorder` (`id`, `dishId`, `orderId`, `dishQuantity`) VALUES
(1, 2, 1, 2),
(2, 1, 1, 1);

-- --------------------------------------------------------

--
-- Структура таблицы `dishphoto`
--

CREATE TABLE IF NOT EXISTS `dishphoto` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id фото блюда',
  `dishId` int(255) NOT NULL COMMENT 'id блюда',
  `url` varchar(10000) NOT NULL COMMENT 'Адрес фото блюда',
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`dishId`),
  KEY `dishId` (`dishId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `dishphoto`
--

INSERT INTO `dishphoto` (`id`, `dishId`, `url`) VALUES
(1, 1, 'resources/images/dishPhoto1');

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
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`companyId`),
  KEY `companyId` (`companyId`),
  KEY `companyId_2` (`companyId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `menu`
--

INSERT INTO `menu` (`id`, `companyId`, `name`, `description`, `date`) VALUES
(1, 1, 'Весна', 'Весеннее меню', '2018-03-12');

-- --------------------------------------------------------

--
-- Структура таблицы `order`
--

CREATE TABLE IF NOT EXISTS `order` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id заказа',
  `tableId` int(255) NOT NULL COMMENT 'id столика',
  `waiterId` int(255) NOT NULL COMMENT 'id официанта',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время заказа',
  PRIMARY KEY (`id`),
  KEY `id` (`id`,`tableId`,`waiterId`),
  KEY `tableId` (`tableId`),
  KEY `waiterId` (`waiterId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `order`
--

INSERT INTO `order` (`id`, `tableId`, `waiterId`, `dateTime`) VALUES
(1, 1, 1, '2018-03-13 07:28:54');

-- --------------------------------------------------------

--
-- Структура таблицы `table`
--

CREATE TABLE IF NOT EXISTS `table` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id столика',
  `scheme` varchar(10000) NOT NULL COMMENT 'Схема расположения столика',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Дамп данных таблицы `table`
--

INSERT INTO `table` (`id`, `scheme`) VALUES
(1, 'resources/images/scheme1');

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
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Дамп данных таблицы `waiter`
--

INSERT INTO `waiter` (`id`, `firstName`, `lastName`, `login`, `password`, `photo`) VALUES
(1, 'Мефодий', 'Венский', '123', '123', 'resources/images/photo1'),
(2, 'Михаил', 'Лесник', '123', '123', 'resources/images/photo2'),
(3, 'Микола', 'Душко', '123', '123', 'resources/images/photo3');

-- --------------------------------------------------------

--
-- Структура таблицы `waitercomment`
--

CREATE TABLE IF NOT EXISTS `waitercomment` (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id комментария',
  `comment` varchar(500) NOT NULL COMMENT 'Комментарий',
  `dateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Дата и время комментария',
  `waiterId` int(255) NOT NULL COMMENT 'id официанта',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Дамп данных таблицы `waitercomment`
--

INSERT INTO `waitercomment` (`id`, `comment`, `dateTime`, `waiterId`) VALUES
(1, 'Неуклюжий, перевернул борщ на платье, требую компенсации!!!', '2018-03-22 10:06:19', 1),
(2, 'Очень приятный молодой человек.', '2018-03-22 07:29:59', 2);

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `category`
--
ALTER TABLE `category`
  ADD CONSTRAINT `category_ibfk_1` FOREIGN KEY (`menuId`) REFERENCES `menu` (`id`);

--
-- Ограничения внешнего ключа таблицы `dish`
--
ALTER TABLE `dish`
  ADD CONSTRAINT `dish_ibfk_1` FOREIGN KEY (`categoryId`) REFERENCES `category` (`id`);

--
-- Ограничения внешнего ключа таблицы `dishcomment`
--
ALTER TABLE `dishcomment`
  ADD CONSTRAINT `dishcomment_ibfk_1` FOREIGN KEY (`dishId`) REFERENCES `dish` (`id`);

--
-- Ограничения внешнего ключа таблицы `dishorder`
--
ALTER TABLE `dishorder`
  ADD CONSTRAINT `dishorder_ibfk_1` FOREIGN KEY (`dishId`) REFERENCES `dish` (`id`),
  ADD CONSTRAINT `dishorder_ibfk_2` FOREIGN KEY (`orderId`) REFERENCES `order` (`id`);

--
-- Ограничения внешнего ключа таблицы `dishphoto`
--
ALTER TABLE `dishphoto`
  ADD CONSTRAINT `dishphoto_ibfk_1` FOREIGN KEY (`dishId`) REFERENCES `dish` (`id`);

--
-- Ограничения внешнего ключа таблицы `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`companyId`) REFERENCES `company` (`id`);

--
-- Ограничения внешнего ключа таблицы `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `order_ibfk_1` FOREIGN KEY (`tableId`) REFERENCES `table` (`id`),
  ADD CONSTRAINT `order_ibfk_2` FOREIGN KEY (`waiterId`) REFERENCES `waiter` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
