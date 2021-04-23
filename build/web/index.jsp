<%-- 
    Document   : index
    Created on : 22.04.2021, 19:20:22
    Author     : zi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style01.css"/>
        <title>Message service: SAX-WS</title>
        <style>
            td {
                text-align: center;
            }
            </style>
    </head>
    <body>
        <header id="main-header">
            <h1>j210 lab02: Message service: SAX-WS</h1>
        </header>
        
        <div class="container">
        <div class="box-1">
        <form name="add" action="MessageKeeperClient">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2">Добавление сообщения</td>
                    </tr>
                    <tr>
                        <td>Пользователь:</td>
                        <td><input type="text" name="user" value="" class="b1"/></td>
                    </tr>
                    <tr>
                        <td>Сообщение:</td>
                        <td><input type="text" name="msg" value="" class="b1"/></td>
                    </tr>
                    <tr>
                        <td>Кнопочка:</td>
                        <td colspan="2"><input type="submit" value="Добавить" name="addMsg" class="b1"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div> 
            
        <div class="box-1">    
        <form name="get1" action="MessageKeeperClient">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2">Получение сообщения по индексу</td>
                    </tr>
                    <tr>
                        <td>Пользователь:</td>
                        <td><input type="text" name="user" value="" class="b1"/></td>
                    </tr>
                    <tr>
                        <td>Индекс сообщения:</td>
                        <td><input type="text" name="idx" value="" class="b1"/></td>
                    </tr>
                    <tr>
                        <td>Кнопочка:</td>
                        <td colspan="2"><input type="submit" value="Получить сообщение" name="getMsg" class="b1"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div>
            
        <div class="box-1">    
        <form name="all" action="MessageKeeperClient">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2">Получение всех сообщений пользователя</td>
                    </tr>
                    <tr>
                        <td>Пользователь:</td>
                        <td><input type="text" name="user" value="" class="b1"/></td>
                    </tr>
                   
                    <tr>
                        <td>Кнопочка:</td>
                        <td colspan="2"><input type="submit" value="Все сообщения" name="allMsg" class="b1"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div>    
        </div>     
            
        <div class="container">
        <div class="box-2">    
        <% 
            String answer = (String)request.getAttribute("answer"); 
            if(answer != null){
                %>
                <%= answer  %>
                <%
            }
        %>
        </div>
        </div>
    </body>
</html>
