package guhar4k.patterns.factorymethod;

public class GameLauncher {
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        Game strategyGame = gameFactory.getGameInstance("Strategy");
        Game racingGame = gameFactory.getGameInstance("Racing");
        strategyGame.play();
        racingGame.play();
    }
}
