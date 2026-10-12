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

import java.util.List;

public class Line {
    // A list is needed because TfL's API returns an array of JSONs rather than
    // a single JSON. This also explains the detour involving Type needed in ./TfLApi.java
    private String id;
    private String name;
    private List<LineStatus> lineStatuses;

    public String getId() {
        // probably not needed for the output shown to user but here just in case
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<LineStatus> getLineStatuses() {
        return this.lineStatuses;
    }
}
