/*
    london-transit-reader - cli program that gets tfl line status
    Copyright (C) 2026  georgekt757

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
import api.TflApi;
public class Main {
    public static void main(String[] args) {
        System.out.println("London Transit Reader Alpha");
        TflApi tflApi = new TflApi();

        // If no arguments given, program simply outputs the status of all TfL rail services
        // by sending all ids to Status
        if (args.length == 0) {
            tflApi.allLines();
        } else if (args[0].equals("help")) {
            System.out.println("Help printout coming soon!");
        } else {
            tflApi.selectLines(args);
        }
    }
}
