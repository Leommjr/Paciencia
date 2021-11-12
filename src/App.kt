fun main(args: Array<String>) {
    GameModel.resetGame();
    GameModel.debugPrint();
    GamePresenter.onDeckTap();
    GameModel.debugPrint();


}