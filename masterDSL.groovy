job('Nodejob'){
	scm{
		git('https://github.com/TestOrgAdigitto/JobDSL.git')
		}

	steps{
		shell{"Hello World"}
	}
}
