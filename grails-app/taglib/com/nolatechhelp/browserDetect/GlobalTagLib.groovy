package com.nolatechhelp.browserDetect

class GlobalTagLib {
 
    def userAgentIdentService
	
	def isMobile = { attrs, body ->
        if (userAgentIdentService.isMobile()) {
            out << body()
        }
    }
	
	def isNotMobile = { attrs, body ->
        if (!userAgentIdentService.isMobile()) {
            out << body()
        }
    }
	
	def isIPhone = { attrs, body ->
        if (userAgentIdentService.isIPhone()) {
            out << body()
        }
    }
	
	def isNotIPhone = { attrs, body ->
        if (!userAgentIdentService.isIPhone()) {
            out << body()
        }
    }
	
	def isAndroid = { attrs, body ->
        if (userAgentIdentService.isAndroid()) {
            out << body()
        }
    }
	
	def isNotAndroid = { attrs, body ->
        if (!userAgentIdentService.isAndroid()) {
            out << body()
        }
    }
	
	def isPalm = { attrs, body ->
        if (userAgentIdentService.isPalm()) {
            out << body()
        }
    }
	
	def isNotPalm = { attrs, body ->
        if (!userAgentIdentService.isPalm()) {
            out << body()
        }
    }
	
	def isWebkit = { attrs, body ->
        if (userAgentIdentService.isWebkit()) {
            out << body()
        }
    }
	
	def isNotWebkit = { attrs, body ->
        if (!userAgentIdentService.isWebkit()) {
            out << body()
        }
    }
	
	def isWindowsMobile = { attrs, body ->
        if (userAgentIdentService.isWindowsMobile()) {
            out << body()
        }
    }
	
	def isNotWindowsMobile = { attrs, body ->
        if (!userAgentIdentService.isWindowsMobile()) {
            out << body()
        }
    }
	
    def isMsie = { attrs, body ->
        if (userAgentIdentService.isMsie()) {
            out << body()
        }
    }
 
    def isNotMsie = { attrs, body ->
        if (!userAgentIdentService.isMsie()) {
            out << body()
        }
    }
 
    def isFirefox = { attrs, body ->
        if (userAgentIdentService.isFirefox()) {
            out << body()
        }
    }
 
    def isNotFirefox = { attrs, body ->
        if (!userAgentIdentService.isFirefox()) {
            out << body()
        }
    }
 
    def isChrome = { attrs, body ->
        if (userAgentIdentService.isChrome()) {
            out << body()
        }
    }
 
    def isNotChrome = { attrs, body ->
        if (!userAgentIdentService.isChrome()) {
            out << body()
        }
    }
 
    def isSafari = { attrs, body ->
        if (userAgentIdentService.isSafari()) {
            out << body()
        }
    }
  
    def isNotSafari = { attrs, body ->
        if (!userAgentIdentService.isSafari()) {
            out << body()
        }
    }
  
    def isBlackberry = { attrs, body ->
        if (userAgentIdentService.isBlackberry()) {
            out << body()
        }    
    }

    def isNotBlackberry = { attrs, body ->
        if (!userAgentIdentService.isBlackberry()) {
            out << body()
        }    
    }

	
}