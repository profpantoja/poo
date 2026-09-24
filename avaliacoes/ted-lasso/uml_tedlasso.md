```mermaid
classDiagram

%% Pacote: controller 

class controller.matchController {
    +  doGet(HttpServletRequest, HttpServletResponse)  void 
    +  doPost(HttpServletRequest, HttpServletResponse)  void
}

%% Pacote: model

class model.Team {
    - name : String
    - colors : String
    - players : List<Player>
    + getName() : String
    + setName(name : String) : void
    + getColors() : String
    + setColors(colors : String) : void
    + getPlayers() : List<Player>
    + setPlayers(players : List<Player>) : void
}

class model.Match {
    - home : Team
    - visitor : Team 
    - homeScore : int
    - visitorScore : int 
    - date : Date
    + getHome() Team
    + setHome(home : Team) void
    + getVisitor() Team
    + setVisitor(visitor : Team) Team
    + getHomeScore() int
    + setHomeScore(homeScore : int) void
    + getVisitorScore() int 
    + setVisitorScore(visitorScore : int) void
    + getDate() Date
    + setDate(date : Date) void
    + getResult() Team
    + getResult(team : Team) int 
}
class model.Player {
    - name : String
    - surname : String
    - number : int
    - position : String
    + getName() : String
    + setName(name : String) : void
    + getSurname() : String
    + setSurname(surname : String) : void
    + getNumber() : int
    + setNumber(number : int) : void
    + getPosition() : String
    + setPosition(position : String) : void
}

model.Team "1" o-- "*" model.Player : players
model.Match "1" o-- "1" model.Team : home
model.Match "1" o-- "1" model.Team : visitor