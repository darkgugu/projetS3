package jeu;

import com.almasb.fxgl.parser.tiled.TiledMap;
import com.almasb.fxgl.scene.GameScene;

import javafx.geometry.Point2D;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class WinOrDefeat extends BasicGameApp {
	private Text text;
	public WinOrDefeat(GameScene gameScene) {
		text = new Text();
		text.setTranslateX(840);
		text.setTranslateY(420);
		text.setFont(Font.font("Verdana", 50));
		gameScene.addUINodes(text);

	}

	public void gameState(Player redPlayer, Player bluePlayer, Player greenPlayer,
			IAControlledEntity gobelin) {
		// Cas de defaite
		if (redPlayer.getHeroClass().isDead() == true && bluePlayer.getHeroClass().isDead() == true && greenPlayer.getHeroClass().isDead() == true) {
			getGameWorld().spawn("rectangle", new Point2D(840, 380));
			text.setText("DEFAITE");
		}

		// Cas de victoire
		if (gobelin.getType().isDead() == true) {
			System.out.println(gobelin.getType().getPv());
			getGameWorld().spawn("rectangle", new Point2D(840, 380));
			text.setText("VICTOIRE");
			TiledMap map2 = getAssetLoader().loadTMX("map2.tmx");
			getGameWorld().setLevelFromMap(map2);

			

		}

	}
}