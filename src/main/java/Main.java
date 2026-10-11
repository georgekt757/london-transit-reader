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
    static void printHelp() {
        System.out.println("London Transit Reader Alpha-1");
        System.out.println("Main [lines] - Outputs the status of the lines input as arguments separated by spaces. You can put as many of these as you want. If no arguments are given, the status of all lines will be returned.");
        System.out.println("               The argument options are:");
        System.out.println("               bakerloo         - Bakerloo line");
        System.out.println("               central          - Central line");
        System.out.println("               circle           - Circle line");
        System.out.println("               district         - District line");
        System.out.println("               hammersmith-city - Hammersmith & City line");
        System.out.println("               jubilee          - Jubilee line");
        System.out.println("               metropolitan     - Metropolitan line");
        System.out.println("               northern         - Northern line");
        System.out.println("               piccadilly       - Piccadilly line");
        System.out.println("               victoria         - Victoria line");
        System.out.println("               waterloo-city    - Waterloo & City line");
        System.out.println("               liberty          - Liberty line");
        System.out.println("               lioness          - Lioness line");
        System.out.println("               mildmay          - Mildmay line");
        System.out.println("               suffragette      - Suffragette line");
        System.out.println("               weaver           - Weaver line");
        System.out.println("               windrush         - Windrush line");
        System.out.println("               dlr              - Docklands Light Railway");
        System.out.println("               elizabeth        - Elizabeth line");
        System.out.println("               tram             - London Trams");
        System.out.println("--help, -h     - Prints this help text");
    }

    public static void main(String[] args) {
        TflApi tflApi = new TflApi();

        // If no arguments given, program simply outputs the status of all TfL rail services
        // by sending all ids to Status
        if (args.length == 0) {
            tflApi.allLines();
        } else if (args[0].equals("--help") || args[0].equals("-h")) {
            printHelp();
        } else {
            tflApi.selectLines(args);
        }
    }
}
