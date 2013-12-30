The projects-platform.cquery is used to materialize the target platform. 
The project.cquery is used to materialize the projects in the workspace.

The build-using-local-mirror.cquery is an example to materialize the target platform
using a local eclipse mirror obtained using the b3 aggregator on the
file aggregator/kepler-xtext-<xtext version>-swtbot-mirror.b3aggr
(xtext version depends on the Xtext version you are currently using); 

it relies on buckminster-local.properties which maps
the URLs for eclipse repositories (used in the RMAP) to the
local aggregated mirror which by default is stored into
file:/${user.home}/mirror/kepler-xtext-<xtext version>-swtbot/final

build.ant can be used to run an headless build, together with all the test suites.
You must pass the location of your buckminster headless installation, e.g.,

-Dbuckminster.home=/path/to/buckminster 

You can also pass additional properties as -D<key>=<value>, for instance, if you
want to use the local aggregated mirror, you must pass

-Dbuild.properties=file:/path/to/buckminster-local.properties

Happy building with Bucky! :)