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

package api;

import java.util.ArrayList;

public class TflApi {
    private ArrayList<String> chosenLines;
    private String arguments;

    public TflApi() {
        this.chosenLines = new ArrayList<>();
        this.arguments = "";
    }

    public void allLines() {
        // Passes every possible id to the TfL API. The max is 20, and 20 are here. If they add
        // more in the future, it may be worth sending two or more separate GET requests
        this.arguments = "bakerloo,central,circle,district,hammersmith-city,jubilee,metropolitan,northern,piccadilly,victoria,waterloo-city,liberty,lioness,mildmay,suffragette,weaver,windrush,dlr,elizabeth,tram";
        // put GET method here once it is created
    }
}
