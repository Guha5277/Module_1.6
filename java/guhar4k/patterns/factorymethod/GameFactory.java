package guhar4k.patterns.factorymethod;

public class GameFactory {
    public Game getGameInstance(String gameType) {
        String gameTypeLowerCase = gameType.toLowerCase();
        switch (gameTypeLowerCase) {
            case "racing":
                return new RacingGame();
            case "strategy":
                return new StrategyGame();
                default: throw new RuntimeException("Unknown game type");
        }
    }
}
