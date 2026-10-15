# london-transit-reader

This program retrieves London rail transit data by reading from TfL's API, and then returns it in a
neat, user-friendly format. It's able to get the status of all London Underground, London
Overground, Docklands Light Railway, Trams, and Elizabeth line services.

## Usage

Invoke the JAR archive you download from the releases section using
`java -jar /path/to/jar/archive`. Passing no arguments to it will cause it to get the status of
every TfL railway service. For a full list of what you can do, please pass `--help` when invoking.

You do not need any API keys from TfL for this. It is a gratis service that TfL provides, though
you're limited to 50 requests per minute.

Be advised that this program is still in an early stage of development, and it **presently does
*NOT* include any error handling!** Pass an argument that does not exist, and the program will
crash! Exception handling will come shortly!

## Licensing, attribution, and use of AI declaration

The source code for this program is distributed under the terms of the GNU General Public License
v3 or later. You may read it by opening [./LICENSES/GPLv3](./LICENSES/GPLv3). Alternatively, you
may obtain a copy of it by [opening this link](https://www.gnu.org/licenses/gpl-3.0.en.html).

This program uses Google's [Gson library](https://github.com/google/gson). This is distributed
under the terms of the Apache 2.0 license, which you may read by opening
[./LICENSES/Apache2](./LICENSES/Apache2). Alternatively, you may obtain a copy of it by
[opening this link](https://www.apache.org/licenses/LICENSE-2.0)

The data and API are provided by Transport for London (TfL) as part of its Transport Data Service.
You may read the terms and conditions of this service by
[opening this link](https://tfl.gov.uk/corporate/terms-and-conditions/transport-data-service)

Powered by TfL Open Data

'Contains OS data © Crown copyright and database rights 2016' and Geomni UK Map data © and
database rights [2019]

This is an independent open source project that is in no way affiliated with or endorsed by
Transport for London

### Use of AI declaration

ChatGPT was used to assist me in the initial parsing the JSON data, as not only had I not done this
before, it proved to be far more difficult than initially anticipated partly due to TfL returning
an array of JSON. The code was thoroughly inspected, tested, and adjusted, and AI has not been
used in any other cases for this project.
