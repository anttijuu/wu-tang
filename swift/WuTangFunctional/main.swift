//
//  main.swift
//  WuTangFunctional
//
//  Created by Antti Juustila on 31.8.2023.
//

import Foundation

func main() {

	let names = [
		"Antti J",
		"Jouni L",
		"Joni R",
		"Kristian H",
		"Pertti K",
		"Markus K",
		"Päivi R-J",
		"Tim C",
		"Bill G"
	]

	print("Wu-Tang name generator for programmers")
	print("--------------------------------------")
	print("- The generator can produce \(Programmers.maxNameCount) unique names")

	createProgrammers(for: names)
		.assignWuTangNames()
		.print()
}

main()
