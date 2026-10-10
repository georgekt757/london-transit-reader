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

public class Main {
    public static void main(String[] args) {
        System.out.println("London Transit Reader Alpha");

        // If no arguments given, program simply outputs the status of all TfL rail services
        if (args.length == 0) {
            System.out.println("All"); // temporary, replace with actual data
        } else if (args[0].equals("piccadilly")) { // temporary test using "piccadilly" as an argument, completely rewrite and replace with actual working methods
            System.out.println("Once again closed on weekends to accomodate the 2024 Stock, much to our inconvenience");
        }
    }
}
