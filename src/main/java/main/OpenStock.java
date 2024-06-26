/*
 * Copyright (C) 2019 Lucas Meyer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author lucasmeyer
 */
public class OpenStock extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            java.util.concurrent.TimeUnit.MILLISECONDS.sleep(2000);
            frame_telaprincipal tprincipal = new frame_telaprincipal();
            tprincipal.setVisible(true);
        }
        catch (Exception ex)
        {
            communication.mcfuncoeshelper.mostrarmensagem("A problem has occurred when initializing Open Stock. Exception: " + ex.getLocalizedMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    // Run with mvn clean javafx:run
}
