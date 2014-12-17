<!DOCTYPE html>
<html>
	<head>
    <asset:stylesheet src="main.css"/>
	</head>
	<body>
    <div id="logo"><asset:image src="victim/logo.png" alt="Victim Logo"/></div>
    <g:form url='[controller: "search", action: "index"]'>
      <div id="searchTextDiv">
        <input type="text" name="searchText" id="searchText" value="${params.searchText}"/>
        <input type="submit" name="doSearch" id="doSearch" value="search" />
      </div>
    </g:form>
	</body>
</html>
