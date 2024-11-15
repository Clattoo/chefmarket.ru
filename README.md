<a name="start"></a>
# <p align="center">Демонстрационный проект по автоматизации</br>тестирования для компании [`«ШефМаркет»`](https://www.chefmarket.ru/)</p>
<a href="https://www.chefmarket.ru"><img src="media/logos/face.png" width="100%" alt="SHEFMARKET"/></a>  

> _<p align="justify"><sub><a href="https://www.chefmarket.ru"><img src="media/logos/logo_flat.png" width="128" alt="SHEFMARKET"/></a></sub></p>_
> _<p align="justify"> &emsp;&emsp;&emsp;&emsp;  — сервис доставки продуктов с рецептами №1 в России и СНГ. Компания основана в 2012 году и входит в глобальный список "Key players" в сегменте meal-kit.</p>_
> 
> _<p align="justify">Компанния разрабатывает рецепты, закупает продукты напрямую у производителей, производит ингредиенты, собирает заказы на собственном производстве и доставляет их непосредственно конечным покупателям - домохозяйствам в Москве, Санкт-Петербурге, Нижнем Новгороде, Туле, Твери, Владимире и Ярославле.</p>_
> 
> _<p align="justify">Программные решения компании включены в Реестр российских программ для электронных вычислительных машин и баз данных Минкомсвязи РФ.</p>_

</br>
</br>
</br>




<a name="table-of-contents"></a>
# Содержание

</br>


* [**О проекте**](#about)
  * [Для чего был создан проект](#for-what)
  * [Технологии и инструменты](#tools)
  * [Что делают тесты?](#tests)
* [**Запуск тестов из терминала**](#console)
  * [Параметры запуска](#console_params)
  * [Примеры запуска тестов](#console_example)
* [**Интеграции и примеры**](#integrations)
  * [Сборка в Jenkins](#jenkins)
  * [Интеграция с Allure Report](#allure-report)
  * [Интеграция с Allure TestOps](#allure-testops)
  * [Интеграция с Jira](#jira)
  * [Уведомление в Telegram при помощи бота](#telegram)
  * [Примеры видео выполнения тестов на Selenoid](#video)

</br>
</br>
</br>




<a name="about"></a>
# О проекте
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="for-what"></a>
### Для чего был создан проект

> [!NOTE]
> _<p align="justify">Основная цель проекта — отработка навыков автоматизации тестирования, улучшение понимания процесса разработки тестов и повышение эффективности обеспечения качества программного обеспечения.</p>_
>
> _<p align="justify">Тестирование проводилось исключительно на уровне пользовательского интерфейса (UI), что позволило сосредоточиться на взаимодействии пользователя с сайтом.</p>_
>
> _<p align="justify">Проект является демонстрационным и включает в себя ряд тестов, охватывающих различные аспекты функциональности, обеспечивая надежность и стабильность работы веб-приложения.</p>_
 
</br>
</br>


<a name="tools"></a>
### Технологии и инструменты

> [!NOTE]
> <details open>
> <summary>Список технологи и инструментов, которые использовались в проекте</summary>
> </br>
> 
> | Логотип                                                                                                                            | Название               | Предназначение                                                                                                    |
> | :---:                                                                                                                              | :---:                  | :---                                                                                                              |
> | <a href="https://www.jetbrains.com/idea"><img src="media/icons/Intelij_IDEA.svg" width="64" height="64" alt="Intellij IDEA"/></a>  | `Intellij`</br>`IDEA`  | Среда разработки программного обеспечения                                                                         |
> | <a href="https://www.java.com"><img src="media/icons/Java.svg" width="64" height="64" alt="Java"/></a>                             | `Java`                 | Язык программирования, на котором написаны тесты                                                                  |
> | <a href="https://junit.org/junit5"><img src="media/icons/JUnit5.svg" width="64" height="64" alt="JUnit 5"/></a>                    | `JUnit 5`              | Фреймворк для модульного тестирования                                                                             |
> | <a href="https://gradle.org"><img src="media/icons/Gradle.svg" width="64" height="64" alt="Gradle"/></a>                           | `Gradle`               | Система автоматической сборки                                                                                     |
> | <a href="https://selenide.org"><img src="media/icons/Selenide.svg" width="64" height="64" alt="Selenide"/></a>                     | `Selenide`             | Фреймворк для автоматизированного тестирования веб-приложений                                                     |
> | <a href="https://github.com"><img src="media/icons/Github.svg" width="64" height="64" alt="Github"/></a>                           | `Github`               | Веб-сервис для хостинга и совместной разработки IT-проектов                                                       |
> | <a href="https://www.jenkins.io"><img src="media/icons/Jenkins.svg" width="64" height="64" alt="Jenkins"/></a>                     | `Jenkins`              | Программная система для обеспечения процесса непрерывной интеграции программного обеспечения                      |
> | <a href="https://allurereport.org"><img src="media/icons/Allure.svg" width="64" height="64" alt="Allure Report"/></a>              | `Allure`</br>`Report`  | Инструмент для визуализации результатов тестового запуска                                                         |
> | <a href="https://qameta.io"><img src="media/icons/AllureTestOps.svg" width="64" height="64" alt="Allure TestOps"/></a>             | `Allure`</br>`TestOps` | Инструмент для управления тестированием, который помогает автоматизировать и оптимизировать процессы тестирования |
> | <a href="https://www.atlassian.com/software/jira"><img src="media/icons/Jira.svg" width="64" height="64" alt="Jira"/></a>          | `Jira`                 | Система отслеживания ошибок и управления проектами                                                                |
> | <a href="https://telegram.org/"><img src="media/icons/Telegram.svg" width="64" height="64" alt="Telegram"/></a>                    | `Telegram`             | Кроссплатформенная система мгновенного обмена сообщениями (мессенджер)                                            |
> | <a href="https://aerokube.com/selenoid"><img src="media/icons/Selenoid.svg" width="64" height="64" alt="Selenoid"/></a>            | `Selenoid`             | Сервер, который позволяет запускать браузеры в docker-контейнерах                                                 |
> 
> </details>


</br>
</br>


<a name="tests"></a>
### Что делают тесты?

> [!NOTE]
> Тесты проверяют разные страницы сайта на работоспособность и корректность данных.</br></br>
>
> **Список проверок:**
> - [x] Проверка наличия видео во вкладке "Как это работает";
> - [x] Проверка наличия и перехода в новогоднее меню 2025 в разделе "Блок о вкусном";
> - [x] Проверка наличия электронных почт разных отделов в разделе "Контакты"; 
> - [x] Проверка, что кнопка 'Получить код' становится активной после ввода номера телефона; 
> - [x] Проверка шаблона списка блюд в меню Оригинальное в разделе "Меню".</br></br>
 
</br>
</br>
</br>




<a name="console"></a>
# Запуск тестов из терминала
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="console_params"></a>
### Параметры запуска

> [!IMPORTANT]
> **Тесты можно запускать как с передачей параметров, так и без них**</br>
> (в этом случае тесты будут запущены с параметрами по умолчанию).
>
> | Параметр          | Описание                                                     | Значение по умолчанию                |
> | :---              | :---                                                         | :---                                 |
> | `TASK`            | Имя задачи в Gradle</br> _(указывает какие тесты выполнить)_ | shefmarket_auto_task                 |
> | `WDHOST`          | Удаленный сервер для выполнения тестов                       | selenoid.autotests.cloud               |
> | `BROWSER`         | Браузер, в котором будут выполняться тесты                   | chrome                               |
> | `BROWSER_VERSION` | Версия браузера, в которой будут выполняться тесты           | 121.0                                |
> | `BROWSER_SIZE`    | Размер окна браузера, в котором будут выполняться тесты      | 1920x1080                            |

</br>

<a name="console_example"></a>
### Примеры запуска тестов

> [!IMPORTANT]
> **Локальный запуск** (без параметров)
> ```
> gradle clean shefmarket_auto_task
> ```

> [!IMPORTANT]
> **Удаленный запуск** (с параметрами)
> ```
> clean
> ${TASK}
> -Dbrowser=${BROWSER}
> -DbrowserSize=${BROWSER_SIZE}
> -DbrowserVersion=${BROWSER_VERSION}
> -Dwdhost=${WDHOST}
> ```

</br>
</br>
</br>




<a name="integrations"></a>
# Интеграции и примеры
<a><p align="right">[<sup>`Перейти к содержанию`</sup>](#table-of-contents)</p></a>


<a name="jenkins"></a>
### Сборка в Jenkins

> [!TIP]
> Реализован запуск тестов с помощью [`Jenkins`](https://jenkins.autotests.cloud/job/clatto_chefmarket_ru/) (требуется авторизация).</br>
> </br>
> Для запуска сборки необходимо: 
> 1. Перейти в раздел `▷ Build with Parameters`
> 2. Выбрать необходимые [параметры](#console_params)
> 3. Нажать кнопку `▷ Build`
>
> | ![jenkins_status](/media/screenshots/jenkins_status.png) | ![jenkins_build](/media/screenshots/jenkins_build.png) |
> |-|-|
>
> После выполнения сборки в разделе `🔆 Build History` можно будет детально изучить прошедние тесты:
> * Посмотреть лог
> * Посмотреть &nbsp; [<img src="media/icons/Allure.svg" width="16" height="16" alt="Allure Report"/>   Allure Report](#allure-report)
> * Посмотреть &nbsp; [<img src="media/icons/AllureTestOps.svg" width="16" height="16" alt="Allure TestOps"/>   Allure TestOps](#allure-testops)

</br>


<a name="allure-report"></a>
### Allure Report

> [!TIP]
> После выполнения тестов формируется [`Allure Report`](https://jenkins.autotests.cloud/job/clatto_ru_chefmarket/5/allure) (требуется авторизация).
> </br>
> </br>
>
> **Основная страница отчёта** `(Overview)`
>
> | ![allure report overview](/media/screenshots/allure_report_overview.png) |
> |-|
> </br>
>
> **Тест-кейсы** `(Suites)`</br>
> _(с шагами и вложениями)_
> 
> | ![allure report suites](/media/screenshots/allure_report_suites.png) |
> |-|
> </br>
>
> **Графики** `(Graphs)`
>
> | ![allure report graphs](/media/screenshots/allure_report_graphs.png) |
> |-|

</br>


<a name="allure-testops"></a>
### Allure TestOps

> [!TIP]
> Выполнена интеграция сборки `Jenkins` с [`Allure TestOps`](https://allure.autotests.cloud/project/4490/dashboards) (требуется авторизация).
> </br>
> </br>
>
> **Один из запусков** `(Launches)`</br>
> _(с шагами пройденного теста)_
> 
> | ![allure testops launches](/media/screenshots/allure_testops_launches.png) |
> |-|
> </br>
>
> **Список тестов**
> 
> | ![allure testops auto tests](/media/screenshots/allure_testops_auto_tests.png) |
> |-|
> </br>


</br>


<a name="jira"></a>
### Интеграция с Jira

> [!TIP]
> Выполнена интеграция `Allure TestOps` с [`Jira`](https://jira.autotests.cloud/browse/HOMEWORK-1366) (требуется авторизация).
> </br>
> </br>
>
> **Основная страница `Jira`**</br>
> 
> | ![jira](/media/screenshots/jira.png) |
> |-|

</br>


<a name="telegram"></a>
### Уведомление в Telegram при помощи бота

> [!TIP]
> Выполнена интеграция сборки `Jenkins` с `Telegram`.
> </br>
> </br>
>
> **После выполнения теста (при запуске на Jenkins) `Telegram-бот` пришлет оповещение в специальный Telegram-канал**</br>
> _(с краткой статистикой пройденных тестов)_
> 
> | ![telegram](/media/screenshots/telegram_1.png) | ![telegram](/media/screenshots/telegram_2.png) |
> |-|-|

</br>


<a name="video"></a>
### Примеры видео выполнения тестов на Selenoid

> [!TIP]
> Несколько примеров выполнения тестов.
> </br>
> </br>
>
> **Проверка перехода в новогоднее меню 2025**</br>
> 
> | ![menu test](/media/gif/NewYearMenu2025.gif) |
> |-|
> </br>
>
> **Проверка активации кнопки "Получить код" после ввода номера телефона в строку ввода**
> 
> | ![check partner test](/media/gif/ReceiveCode.gif) |
> |-|
> </br>
---

</br>

<a><p align="right">[`Shlemin Maxim © 2024`](https://github.com/Clattoo)</p></a>
