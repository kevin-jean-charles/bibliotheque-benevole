import { Section } from "./section";

export interface Book {
    id: number;
    title: string;
    author: string[];
    description: string;
    section: Section;
    cover: string;
}
