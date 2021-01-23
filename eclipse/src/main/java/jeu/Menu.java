package jeu;
import com.almasb.fxgl.app.FXGL;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.extra.scene.menu.GTAVMenu;
import com.almasb.fxgl.scene.FXGLMenu;
import com.almasb.fxgl.scene.SceneFactory;
import com.almasb.fxgl.scene.menu.MenuType;
import com.almasb.fxgl.settings.GameSettings;
import com.almasb.fxgl.ui.FXGLScrollPane;
import com.almasb.fxgl.ui.FXGLTextFlow;

import javafx.beans.binding.StringBinding;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class Menu extends FXGLMenu {
	 protected void initSettings(GameSettings settings) {
	        settings.setMenuEnabled(true);

	        settings.setSceneFactory(new SceneFactory() {
	            public FXGLMenu newMainMenu() {
	                return new GTAVMenu(app, MenuType.MAIN_MENU);
	            }
	        });
	    }
	 
	public Menu(GameApplication app, MenuType type) {
		super(app, type);
	}

	@Override
	protected Button createActionButton(String name, Runnable action) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node createBackground(double width, double height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node createTitleView(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node createVersionView(String version) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node createProfileView(String profileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Button createActionButton(StringBinding name, Runnable action) {
		// TODO Auto-generated method stub
		return null;
	}


}
