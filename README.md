# Task 2: Фабричный метод

Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.

Abstract Superclass. Класс, выступающий в этой роли, представляет собой абстрактный суперкласс, в котором инкапсулирована общая логика связанных классов. Связанные классы расширяют этот класс. Таким образом, они могут наследовать его методы. Методы с одинаковыми сигнатурами и общей логикой для всех связанных классов помещаются в суперкласс, поэтому логика этих методов может наследоваться всеми подклассами данного суперкласса. Методы с зависящей от конкретного подкласса данного суперкласса логикой, но с одинаковыми сигнатурами, объявляются в абстрактном классе как абстрактные методы, тем самым гарантируя, что каждый конкретный подкласс будет иметь методы с такими же сигнатурами.

Программа представляет собой приложение реализующие паттерны: Прототип, Фабричный метод, Абстрактный суперкласс и технологию HashMap, которое позволяет рисовать фигуры в указанном месте, выбирая их из списка, отрисовка фигур производится на основе технологии HashMap через паттерн "Фабричный метод"

Рабочее окно приложения

![изображение](https://user-images.githubusercontent.com/83115120/233290590-a5fb4644-caa1-4f65-a3d8-72e4e5a7905f.png)

Архитектура

![изображение](https://user-images.githubusercontent.com/83115120/233290681-a74bcce4-e53e-4154-a9ac-97c4059ff6bd.png)
