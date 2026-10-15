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

public class LineStatus {
    // JSON for JSON! Since there's a nested JSON sequence, this is the class
    // needed to interact with that.
    private int id;
    private int statusSeverity;
    private String statusSeverityDescription;
    private String reason;

    public int getId() {
        return this.id;
    }

    public int getStatusSeverity() {
        return this.statusSeverity;
    }

    public String getStatusSeverityDescription() {
        return this.statusSeverityDescription;
    }

    public String getReason() {
        return this.reason;
    }

    // will also need to add method for disruption reason i think
}
